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

Public Sub Create( id As Int, nombre As String, caracteristica As String) As ResumableSub
	Dim especie As Especie
	Dim json As String
	Dim data As Map
	especie.Initialize()
	json = "{ 'id' : 0, 'nombre' : '" & nombre & "', 'caracteristica': '" & caracteristica & "' }"
	apiJob.Initialize("", Me)
	apiJob.PostString( ApiURL, json )
	apiJob.GetRequest.SetContentType("application/json")
	wait for (apiJob) JobDone( resultado As HttpJob )
	If resultado.Success Then
		jsonParser.Initialize( resultado.GetString )
		data = jsonParser.NextObject
		especie.Id = data.Get("id")
		especie.Nombre = data.Get("nombre")
		especie.Caracteristica = data.Get("caracteristica")
	End If
	Return especie
End Sub

Public Sub ReadByiD(id As Int)As ResumableSub
	Dim especie As Especie
	especie.Initialize
	apiJob.Initialize("", Me)
	apiJob.Download( ApiURL & "/" & id)
	wait for (apiJob) JobDone( resulatdo As HttpJob )
	If resulatdo.Success Then
		jsonParser.Initialize( resulatdo.GetString )
		Dim map As Map = jsonParser.NextObject
		especie.Id = map.Get("id")
		especie.Nombre = map.Get("nombre")
		especie.Caracteristica = map.Get("caracteristica")
	End If
	Return especie
	
End Sub

Public Sub Update(id As Int, nombre As String, caracteristica As String) As ResumableSub
	Dim especie As Especie
	Dim json As String
	Dim data As Map
	especie.Initialize()
	json = "{ 'id' : " & id & ", 'nombre' : '" & nombre & "', 'caracteristica': '" & caracteristica & "' }"
	apiJob.Initialize("", Me)
	apiJob.PutString( ApiURL & "/" & id, json )
	apiJob.GetRequest.SetContentType("application/json")
	wait for (apiJob) JobDone( resultado As HttpJob )
	Return resultado.Success
End Sub

Public Sub Delete(id As Int)As ResumableSub
	apiJob.Initialize("", Me)
	apiJob.Delete( ApiURL & "/" & id )
	wait for (apiJob) JobDone( resultado As HttpJob )
	Return resultado.Success
End Sub

Public Sub RedAll()As ResumableSub
	Dim especies As List
	Dim map As Map
	Dim lst As List
	especies.Initialize()

	apiJob.Initialize("",Me)
	apiJob.Download(ApiURL)
	wait For (apiJob) JobDone(resultado As HttpJob)
	If resultado.Success Then
		jsonParser.Initialize(resultado.GetString)
		lst= jsonParser.NextArray
		For i=0 To lst.Size-1
			map=lst.Get(i)
			Dim especie As Especie
			especie.Initialize
			especie.Id=map.Get("id")
			especie.Nombre=map.Get("nombre")
			especie.Caracteristica=map.Get("caracteristica")
			especies.Add(especie)
		Next
		
	End If
	
	Return especies
End Sub