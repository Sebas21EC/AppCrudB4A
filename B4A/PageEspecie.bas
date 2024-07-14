B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private apiEspecies As EspecieRepository
	Private txtId As EditText
	Private txtNombre As EditText
	Private txtCaracteristica As EditText
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("PageEspecie")
	apiEspecies.Initialize("https://appanimalesapi2024trujillo.azurewebsites.net/api/Grupos")
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub btnDelete_Click
	Wait For (apiEspecies.Delete(txtId.Text)) Complete (r As Boolean)
	'If d.Id > 0 Then'
	If r = True Then
		
		Msgbox("El registro se eliminó correctamente", "Ok")
	Else
		Msgbox("No se pudo eliminar el registro", "Error")
	End If
End Sub

Private Sub btnPut_Click
	Wait For (apiEspecies.Update(txtId.Text, txtNombre.Text,txtCaracteristica.Text)) Complete ( e As Boolean )
	If e = True Then
		Msgbox("Actualizado especie", "OK")
	Else
		Msgbox("No se pudo actualizar el registro", "Error")
	End If
End Sub

Private Sub btnPost_Click
	
	Wait For (apiEspecies.Create( 0, txtNombre.Text,txtCaracteristica.Text)) Complete ( e As Especie )
	If e.Id > 0 Then
		Log("Nuevo id: " & e.Id)
		Msgbox("Insertado nueva especie: ("&e.Id&" : "&e.Nombre&")", "OK")
	Else
		Msgbox("No se pudo insertar el registro", "Error")
	End If
End Sub

Private Sub btnRegresar_Click
	B4XPages.ClosePage(Me)
End Sub

Private Sub btnGet_Click
	Wait For (apiEspecies.ReadByiD(txtId.Text)) Complete (e As Especie)
	'If d.Id > 0 Then'
	If e.Id > 0 Then
			Log(e.Id)
			txtId.Text=e.Id
			Log(e.Nombre)
			txtNombre.Text=e.Nombre
			Log(e.Caracteristica)
			txtCaracteristica.Text= e.Caracteristica
		Msgbox("El registro se encontró y se cargo en los cuadros de texto", "Ok")
	Else
		Msgbox("No se pudo encontrar el registro", "Error")
	End If
End Sub


Private Sub btnGetAll_Click
	Wait For (apiEspecies.RedAll) Complete (r As List)
	'If d.Id > 0 Then'
	If r.Size > 0 Then
		For Each d As Especie In r
			Log("--------------")

			Log(d.Id)
			Log(d.Nombre)
			Log(d.Caracteristica)
			
		Next
		Msgbox("Los datos han sido leídos, solo pueden verse en consola", "Ok")
	Else
		Msgbox("No se pudo insertar el registro", "Error")
	End If
End Sub