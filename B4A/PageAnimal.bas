B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private txtId As EditText
	Private apiEspecies As EspecieRepository
	Private apiAnimales As AnimalRepository
	Private txtNombre As EditText
	Private txtDescripcion As EditText
	Private cbxEspecie As Spinner
	Private speciesMap As Map
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	speciesMap.Initialize
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created(Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("PageAnimal")
	apiAnimales.Initialize("https://appanimalesapi2024trujillo.azurewebsites.net/api/Animales")
	apiEspecies.Initialize("https://appanimalesapi2024trujillo.azurewebsites.net/api/Grupos")
    
	' Load the species into the spinner
	Wait For (apiEspecies.RedAll) Complete (species As List)
	If species <> Null Then
		Log("Número de especies cargadas: " & species.Size)
		If species.Size > 0 Then
			For Each specie As Especie In species
				cbxEspecie.Add(specie.Nombre)
				speciesMap.Put(specie.Nombre, specie.Id) ' Save the species id
				Log("Especie agregada al Spinner: " & specie.Nombre)
			Next
		Else
			Log("No se encontraron especies.")
		End If
	Else
		Log("No se pudieron obtener especies.")
	End If
End Sub

Private Sub cbxEspecie_ItemClick(Position As Int, Value As Object)
	' Handle spinner item click if needed
End Sub

Private Sub btnDelete_Click
	Wait For (apiAnimales.Delete(txtId.Text)) Complete (r As Boolean)
	If r = True Then
		Msgbox("El registro se eliminó correctamente", "Ok")
	Else
		Msgbox("No se pudo eliminar el registro", "Error")
	End If
End Sub

Private Sub btnPut_Click
	Dim selectedSpeciesName As String = cbxEspecie.SelectedItem
	Dim selectedSpeciesId As Int = speciesMap.Get(selectedSpeciesName)
    
	Wait For (apiAnimales.Update(txtId.Text, txtNombre.Text, txtDescripcion.Text, selectedSpeciesId)) Complete (e As Boolean)
	If e = True Then
		Msgbox("Actualizado animal", "OK")
	Else
		Msgbox("No se pudo actualizar el registro", "Error")
	End If
End Sub

Private Sub btnPost_Click
	Dim selectedSpeciesName As String = cbxEspecie.SelectedItem
	Dim selectedSpeciesId As Int = speciesMap.Get(selectedSpeciesName)
    
	Wait For (apiAnimales.Create(0, txtNombre.Text, txtDescripcion.Text, selectedSpeciesId)) Complete (e As Animal)
	If e.Id > 0 Then
		Log("Nuevo id: " & e.Id)
		Msgbox("Insertado nuevo animal: (" & e.Id & " : " & e.Nombre & ")", "OK")
	Else
		Msgbox("No se pudo insertar el registro", "Error")
	End If
End Sub

Private Sub btnRegresar_Click
	B4XPages.ClosePage(Me)
End Sub

Private Sub btnGet_Click
	Wait For (apiAnimales.ReadById(txtId.Text)) Complete (e As Animal)
	If e.Id > 0 Then
		Log(e.Id)
		txtId.Text = e.Id
		Log(e.Nombre)
		txtNombre.Text = e.Nombre
		Log(e.Descripcion)
		txtDescripcion.Text = e.Descripcion
		Log(e.Id_Especie)
        
		' Encontrar y seleccionar el elemento correcto en el Spinner
		For i = 0 To cbxEspecie.Size - 1
			If speciesMap.Get(cbxEspecie.GetItem(i)) = e.Id_Especie Then
				cbxEspecie.SelectedIndex = i
				Exit
			End If
		Next
        
		Msgbox("El registro se encontró y se cargó en los cuadros de texto", "Ok")
	Else
		Msgbox("No se pudo encontrar el registro", "Error")
	End If
End Sub

Private Sub btnGetAll_Click
	Wait For (apiAnimales.ReadAll) Complete (r As List)
	If r.Size > 0 Then
		For Each d As Animal In r
			Log("--------------")
			Log(d.Id)
			Log(d.Nombre)
			Log(d.Descripcion)
			Log(d.Id_Especie)
		Next
		Msgbox("Los datos han sido leídos, solo pueden verse en consola", "Ok")
	Else
		Msgbox("No se pudieron leer los registros", "Error")
	End If
End Sub
