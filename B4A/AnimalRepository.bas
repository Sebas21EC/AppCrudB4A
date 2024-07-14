B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private jsonParser As JSONParser
	Private apiJob As HttpJob
	Public ApiURL As String
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(url As String)
	ApiURL=url
End Sub

Public Sub Create(id As Int, nombre As String, descripcion As String, id_especie As Int) As ResumableSub
	Dim animal As Animal
	Dim json As String
	Dim data As Map
	animal.Initialize()
	json = "{ 'id' : " & id & ", 'nombre' : '" & nombre & "', 'descripcion': '" & descripcion & "', 'grupoId': " & id_especie & " }"
	apiJob.Initialize("", Me)
	apiJob.PostString(ApiURL, json)
	apiJob.GetRequest.SetContentType("application/json")
	wait for (apiJob) JobDone(resultado As HttpJob)
	If resultado.Success Then
		jsonParser.Initialize(resultado.GetString)
		data = jsonParser.NextObject
		animal.Id = data.Get("id")
		animal.Nombre = data.Get("nombre")
		animal.Descripcion = data.Get("descripcion")
		animal.Id_Especie = data.Get("grupoId")
	End If
	Return animal
End Sub


Public Sub ReadById(id As Int) As ResumableSub
	Dim animal As Animal
	animal.Initialize
	apiJob.Initialize("", Me)
	apiJob.Download(ApiURL & "/" & id)
	wait for (apiJob) JobDone(resultado As HttpJob)
	If resultado.Success Then
		jsonParser.Initialize(resultado.GetString)
		Dim map As Map = jsonParser.NextObject
		animal.Id = map.Get("id")
		animal.Nombre = map.Get("nombre")
		animal.Descripcion = map.Get("descripcion")
		animal.Id_Especie = map.Get("grupoId")
	End If
	Return animal
End Sub


Public Sub Update(id As Int, nombre As String, descripcion As String, id_especie As Int) As ResumableSub
	Dim json As String
	json = "{ 'id' : " & id & ", 'nombre' : '" & nombre & "', 'descripcion': '" & descripcion & "', 'grupoId': " & id_especie & " }"
	apiJob.Initialize("", Me)
	apiJob.PutString(ApiURL & "/" & id, json)
	apiJob.GetRequest.SetContentType("application/json")
	wait for (apiJob) JobDone(resultado As HttpJob)
	Return resultado.Success
End Sub

Public Sub Delete(id As Int) As ResumableSub
	apiJob.Initialize("", Me)
	apiJob.Delete(ApiURL & "/" & id)
	wait for (apiJob) JobDone(resultado As HttpJob)
	Return resultado.Success
End Sub


Public Sub ReadAll() As ResumableSub
	Dim animals As List
	Dim map As Map
	Dim lst As List
	animals.Initialize

	apiJob.Initialize("", Me)
	apiJob.Download(ApiURL)
	wait For (apiJob) JobDone(resultado As HttpJob)
	If resultado.Success Then
		jsonParser.Initialize(resultado.GetString)
		lst = jsonParser.NextArray
		For i = 0 To lst.Size - 1
			map = lst.Get(i)
			Dim animal As Animal
			animal.Initialize
			animal.Id = map.Get("id")
			animal.Nombre = map.Get("nombre")
			animal.Descripcion = map.Get("descripcion")
			animal.Id_Especie = map.Get("grupoId")
			animals.Add(animal)
		Next
	End If

	Return animals
End Sub
