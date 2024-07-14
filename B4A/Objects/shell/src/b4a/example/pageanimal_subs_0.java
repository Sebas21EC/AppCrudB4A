package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class pageanimal_subs_0 {


public static void  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (pageanimal) ","pageanimal",3,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("b4xpage_created")) { __ref.runUserSub(false, "pageanimal","b4xpage_created", __ref, _root1); return;}
ResumableSub_B4XPage_Created rsub = new ResumableSub_B4XPage_Created(null,__ref,_root1);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_B4XPage_Created extends BA.ResumableSub {
public ResumableSub_B4XPage_Created(b4a.example.pageanimal parent,RemoteObject __ref,RemoteObject _root1) {
this.parent = parent;
this.__ref = __ref;
this._root1 = _root1;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.pageanimal parent;
RemoteObject _root1;
RemoteObject _species = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _specie = RemoteObject.declareNull("b4a.example.especie");
RemoteObject group9;
int index9;
int groupLen9;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (pageanimal) ","pageanimal",3,__ref.getField(false, "ba"),__ref,20);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 21;BA.debugLine="Root = Root1";
Debug.ShouldStop(1048576);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 23;BA.debugLine="Root.LoadLayout(\"PageAnimal\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("PageAnimal")),__ref.getField(false, "ba"));
 BA.debugLineNum = 24;BA.debugLine="apiAnimales.Initialize(\"https://appanimalesapi202";
Debug.ShouldStop(8388608);
__ref.getField(false,"_apianimales" /*RemoteObject*/ ).runClassMethod (b4a.example.animalrepository.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("https://appanimalesapi2024trujillo.azurewebsites.net/api/Animales")));
 BA.debugLineNum = 25;BA.debugLine="apiEspecies.Initialize(\"https://appanimalesapi202";
Debug.ShouldStop(16777216);
__ref.getField(false,"_apiespecies" /*RemoteObject*/ ).runClassMethod (b4a.example.especierepository.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("https://appanimalesapi2024trujillo.azurewebsites.net/api/Grupos")));
 BA.debugLineNum = 28;BA.debugLine="Wait For (apiEspecies.RedAll) Complete (species A";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "pageanimal", "b4xpage_created"), __ref.getField(false,"_apiespecies" /*RemoteObject*/ ).runClassMethod (b4a.example.especierepository.class, "_redall" /*RemoteObject*/ ));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_species = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("species", _species);
;
 BA.debugLineNum = 29;BA.debugLine="If species <> Null Then";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//if
this.state = 16;
if (RemoteObject.solveBoolean("N",_species)) { 
this.state = 3;
}else {
this.state = 15;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 30;BA.debugLine="Log(\"Número de especies cargadas: \" & species.Si";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","61638410",RemoteObject.concat(RemoteObject.createImmutable("Número de especies cargadas: "),_species.runMethod(true,"getSize")),0);
 BA.debugLineNum = 31;BA.debugLine="If species.Size > 0 Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 4:
//if
this.state = 13;
if (RemoteObject.solveBoolean(">",_species.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 6;
}else {
this.state = 12;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 32;BA.debugLine="For Each specie As Especie In species";
Debug.ShouldStop(-2147483648);
if (true) break;

case 7:
//for
this.state = 10;
group9 = _species;
index9 = 0;
groupLen9 = group9.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("specie", _specie);
this.state = 18;
if (true) break;

case 18:
//C
this.state = 10;
if (index9 < groupLen9) {
this.state = 9;
_specie = (group9.runMethod(false,"Get",index9));Debug.locals.put("specie", _specie);}
if (true) break;

case 19:
//C
this.state = 18;
index9++;
Debug.locals.put("specie", _specie);
if (true) break;

case 9:
//C
this.state = 19;
 BA.debugLineNum = 33;BA.debugLine="cbxEspecie.Add(specie.Nombre)";
Debug.ShouldStop(1);
__ref.getField(false,"_cbxespecie" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_specie.getField(true,"_nombre" /*RemoteObject*/ )));
 BA.debugLineNum = 34;BA.debugLine="speciesMap.Put(specie.Nombre, specie.Id) ' Sav";
Debug.ShouldStop(2);
__ref.getField(false,"_speciesmap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_specie.getField(true,"_nombre" /*RemoteObject*/ ))),(Object)((_specie.getField(true,"_id" /*RemoteObject*/ ))));
 BA.debugLineNum = 35;BA.debugLine="Log(\"Especie agregada al Spinner: \" & specie.N";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","61638415",RemoteObject.concat(RemoteObject.createImmutable("Especie agregada al Spinner: "),_specie.getField(true,"_nombre" /*RemoteObject*/ )),0);
 if (true) break;
if (true) break;

case 10:
//C
this.state = 13;
Debug.locals.put("specie", _specie);
;
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 38;BA.debugLine="Log(\"No se encontraron especies.\")";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("LogImpl","61638418",RemoteObject.createImmutable("No se encontraron especies."),0);
 if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 41;BA.debugLine="Log(\"No se pudieron obtener especies.\")";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","61638421",RemoteObject.createImmutable("No se pudieron obtener especies."),0);
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _complete(RemoteObject __ref,RemoteObject _species) throws Exception{
}
public static void  _btndelete_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnDelete_Click (pageanimal) ","pageanimal",3,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("btndelete_click")) { __ref.runUserSub(false, "pageanimal","btndelete_click", __ref); return;}
ResumableSub_btnDelete_Click rsub = new ResumableSub_btnDelete_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnDelete_Click extends BA.ResumableSub {
public ResumableSub_btnDelete_Click(b4a.example.pageanimal parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.pageanimal parent;
RemoteObject _r = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnDelete_Click (pageanimal) ","pageanimal",3,__ref.getField(false, "ba"),__ref,49);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 50;BA.debugLine="Wait For (apiAnimales.Delete(txtId.Text)) Complet";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "pageanimal", "btndelete_click"), __ref.getField(false,"_apianimales" /*RemoteObject*/ ).runClassMethod (b4a.example.animalrepository.class, "_delete" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_r = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("r", _r);
;
 BA.debugLineNum = 51;BA.debugLine="If r = True Then";
Debug.ShouldStop(262144);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_r,parent.__c.getField(true,"True"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 52;BA.debugLine="Msgbox(\"El registro se eliminó correctamente\", \"";
Debug.ShouldStop(524288);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("El registro se eliminó correctamente")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Ok"))),__ref.getField(false, "ba"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 54;BA.debugLine="Msgbox(\"No se pudo eliminar el registro\", \"Error";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se pudo eliminar el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _btnget_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnGet_Click (pageanimal) ","pageanimal",3,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("btnget_click")) { __ref.runUserSub(false, "pageanimal","btnget_click", __ref); return;}
ResumableSub_btnGet_Click rsub = new ResumableSub_btnGet_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnGet_Click extends BA.ResumableSub {
public ResumableSub_btnGet_Click(b4a.example.pageanimal parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.pageanimal parent;
RemoteObject _e = RemoteObject.declareNull("b4a.example.animal");
int _i = 0;
int step10;
int limit10;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnGet_Click (pageanimal) ","pageanimal",3,__ref.getField(false, "ba"),__ref,87);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 88;BA.debugLine="Wait For (apiAnimales.ReadById(txtId.Text)) Compl";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "pageanimal", "btnget_click"), __ref.getField(false,"_apianimales" /*RemoteObject*/ ).runClassMethod (b4a.example.animalrepository.class, "_readbyid" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_e = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("e", _e);
;
 BA.debugLineNum = 89;BA.debugLine="If e.Id > 0 Then";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//if
this.state = 14;
if (RemoteObject.solveBoolean(">",_e.getField(true,"_id" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 90;BA.debugLine="Log(e.Id)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","62031619",BA.NumberToString(_e.getField(true,"_id" /*RemoteObject*/ )),0);
 BA.debugLineNum = 91;BA.debugLine="txtId.Text = e.Id";
Debug.ShouldStop(67108864);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_e.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 92;BA.debugLine="Log(e.Nombre)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","62031621",_e.getField(true,"_nombre" /*RemoteObject*/ ),0);
 BA.debugLineNum = 93;BA.debugLine="txtNombre.Text = e.Nombre";
Debug.ShouldStop(268435456);
__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_e.getField(true,"_nombre" /*RemoteObject*/ )));
 BA.debugLineNum = 94;BA.debugLine="Log(e.Descripcion)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","62031623",_e.getField(true,"_descripcion" /*RemoteObject*/ ),0);
 BA.debugLineNum = 95;BA.debugLine="txtDescripcion.Text = e.Descripcion";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_txtdescripcion" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_e.getField(true,"_descripcion" /*RemoteObject*/ )));
 BA.debugLineNum = 96;BA.debugLine="Log(e.Id_Especie)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","62031625",BA.NumberToString(_e.getField(true,"_id_especie" /*RemoteObject*/ )),0);
 BA.debugLineNum = 99;BA.debugLine="For i = 0 To cbxEspecie.Size - 1";
Debug.ShouldStop(4);
if (true) break;

case 4:
//for
this.state = 11;
step10 = 1;
limit10 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cbxespecie" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 16;
if (true) break;

case 16:
//C
this.state = 11;
if ((step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10)) this.state = 6;
if (true) break;

case 17:
//C
this.state = 16;
_i = ((int)(0 + _i + step10)) ;
Debug.locals.put("i", _i);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 100;BA.debugLine="If speciesMap.Get(cbxEspecie.GetItem(i)) = e.Id";
Debug.ShouldStop(8);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_speciesmap" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((__ref.getField(false,"_cbxespecie" /*RemoteObject*/ ).runMethod(true,"GetItem",(Object)(BA.numberCast(int.class, _i)))))),(_e.getField(true,"_id_especie" /*RemoteObject*/ )))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 101;BA.debugLine="cbxEspecie.SelectedIndex = i";
Debug.ShouldStop(16);
__ref.getField(false,"_cbxespecie" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",BA.numberCast(int.class, _i));
 BA.debugLineNum = 102;BA.debugLine="Exit";
Debug.ShouldStop(32);
this.state = 11;
if (true) break;
 if (true) break;

case 10:
//C
this.state = 17;
;
 if (true) break;
if (true) break;

case 11:
//C
this.state = 14;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 106;BA.debugLine="Msgbox(\"El registro se encontró y se cargó en lo";
Debug.ShouldStop(512);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("El registro se encontró y se cargó en los cuadros de texto")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Ok"))),__ref.getField(false, "ba"));
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 108;BA.debugLine="Msgbox(\"No se pudo encontrar el registro\", \"Erro";
Debug.ShouldStop(2048);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se pudo encontrar el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _btngetall_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnGetAll_Click (pageanimal) ","pageanimal",3,__ref.getField(false, "ba"),__ref,112);
if (RapidSub.canDelegate("btngetall_click")) { __ref.runUserSub(false, "pageanimal","btngetall_click", __ref); return;}
ResumableSub_btnGetAll_Click rsub = new ResumableSub_btnGetAll_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnGetAll_Click extends BA.ResumableSub {
public ResumableSub_btnGetAll_Click(b4a.example.pageanimal parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.pageanimal parent;
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _d = RemoteObject.declareNull("b4a.example.animal");
RemoteObject group3;
int index3;
int groupLen3;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnGetAll_Click (pageanimal) ","pageanimal",3,__ref.getField(false, "ba"),__ref,112);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 113;BA.debugLine="Wait For (apiAnimales.ReadAll) Complete (r As Lis";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "pageanimal", "btngetall_click"), __ref.getField(false,"_apianimales" /*RemoteObject*/ ).runClassMethod (b4a.example.animalrepository.class, "_readall" /*RemoteObject*/ ));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_r = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("r", _r);
;
 BA.debugLineNum = 114;BA.debugLine="If r.Size > 0 Then";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//if
this.state = 10;
if (RemoteObject.solveBoolean(">",_r.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 115;BA.debugLine="For Each d As Animal In r";
Debug.ShouldStop(262144);
if (true) break;

case 4:
//for
this.state = 7;
group3 = _r;
index3 = 0;
groupLen3 = group3.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("d", _d);
this.state = 12;
if (true) break;

case 12:
//C
this.state = 7;
if (index3 < groupLen3) {
this.state = 6;
_d = (group3.runMethod(false,"Get",index3));Debug.locals.put("d", _d);}
if (true) break;

case 13:
//C
this.state = 12;
index3++;
Debug.locals.put("d", _d);
if (true) break;

case 6:
//C
this.state = 13;
 BA.debugLineNum = 116;BA.debugLine="Log(\"--------------\")";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","62097156",RemoteObject.createImmutable("--------------"),0);
 BA.debugLineNum = 117;BA.debugLine="Log(d.Id)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("LogImpl","62097157",BA.NumberToString(_d.getField(true,"_id" /*RemoteObject*/ )),0);
 BA.debugLineNum = 118;BA.debugLine="Log(d.Nombre)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("LogImpl","62097158",_d.getField(true,"_nombre" /*RemoteObject*/ ),0);
 BA.debugLineNum = 119;BA.debugLine="Log(d.Descripcion)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","62097159",_d.getField(true,"_descripcion" /*RemoteObject*/ ),0);
 BA.debugLineNum = 120;BA.debugLine="Log(d.Id_Especie)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("LogImpl","62097160",BA.NumberToString(_d.getField(true,"_id_especie" /*RemoteObject*/ )),0);
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
Debug.locals.put("d", _d);
;
 BA.debugLineNum = 122;BA.debugLine="Msgbox(\"Los datos han sido leídos, solo pueden v";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Los datos han sido leídos, solo pueden verse en consola")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Ok"))),__ref.getField(false, "ba"));
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 124;BA.debugLine="Msgbox(\"No se pudieron leer los registros\", \"Err";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se pudieron leer los registros")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _btnpost_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnPost_Click (pageanimal) ","pageanimal",3,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("btnpost_click")) { __ref.runUserSub(false, "pageanimal","btnpost_click", __ref); return;}
ResumableSub_btnPost_Click rsub = new ResumableSub_btnPost_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnPost_Click extends BA.ResumableSub {
public ResumableSub_btnPost_Click(b4a.example.pageanimal parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.pageanimal parent;
RemoteObject _selectedspeciesname = RemoteObject.createImmutable("");
RemoteObject _selectedspeciesid = RemoteObject.createImmutable(0);
RemoteObject _e = RemoteObject.declareNull("b4a.example.animal");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnPost_Click (pageanimal) ","pageanimal",3,__ref.getField(false, "ba"),__ref,70);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 71;BA.debugLine="Dim selectedSpeciesName As String = cbxEspecie.Se";
Debug.ShouldStop(64);
_selectedspeciesname = __ref.getField(false,"_cbxespecie" /*RemoteObject*/ ).runMethod(true,"getSelectedItem");Debug.locals.put("selectedSpeciesName", _selectedspeciesname);Debug.locals.put("selectedSpeciesName", _selectedspeciesname);
 BA.debugLineNum = 72;BA.debugLine="Dim selectedSpeciesId As Int = speciesMap.Get(sel";
Debug.ShouldStop(128);
_selectedspeciesid = BA.numberCast(int.class, __ref.getField(false,"_speciesmap" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_selectedspeciesname))));Debug.locals.put("selectedSpeciesId", _selectedspeciesid);Debug.locals.put("selectedSpeciesId", _selectedspeciesid);
 BA.debugLineNum = 74;BA.debugLine="Wait For (apiAnimales.Create(0, txtNombre.Text, t";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "pageanimal", "btnpost_click"), __ref.getField(false,"_apianimales" /*RemoteObject*/ ).runClassMethod (b4a.example.animalrepository.class, "_create" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_txtdescripcion" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(_selectedspeciesid)));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_e = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("e", _e);
;
 BA.debugLineNum = 75;BA.debugLine="If e.Id > 0 Then";
Debug.ShouldStop(1024);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean(">",_e.getField(true,"_id" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 76;BA.debugLine="Log(\"Nuevo id: \" & e.Id)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","61900550",RemoteObject.concat(RemoteObject.createImmutable("Nuevo id: "),_e.getField(true,"_id" /*RemoteObject*/ )),0);
 BA.debugLineNum = 77;BA.debugLine="Msgbox(\"Insertado nuevo animal: (\" & e.Id & \" :";
Debug.ShouldStop(4096);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Insertado nuevo animal: ("),_e.getField(true,"_id" /*RemoteObject*/ ),RemoteObject.createImmutable(" : "),_e.getField(true,"_nombre" /*RemoteObject*/ ),RemoteObject.createImmutable(")")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 79;BA.debugLine="Msgbox(\"No se pudo insertar el registro\", \"Error";
Debug.ShouldStop(16384);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se pudo insertar el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _btnput_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnPut_Click (pageanimal) ","pageanimal",3,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("btnput_click")) { __ref.runUserSub(false, "pageanimal","btnput_click", __ref); return;}
ResumableSub_btnPut_Click rsub = new ResumableSub_btnPut_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnPut_Click extends BA.ResumableSub {
public ResumableSub_btnPut_Click(b4a.example.pageanimal parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.pageanimal parent;
RemoteObject _selectedspeciesname = RemoteObject.createImmutable("");
RemoteObject _selectedspeciesid = RemoteObject.createImmutable(0);
RemoteObject _e = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnPut_Click (pageanimal) ","pageanimal",3,__ref.getField(false, "ba"),__ref,58);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 59;BA.debugLine="Dim selectedSpeciesName As String = cbxEspecie.Se";
Debug.ShouldStop(67108864);
_selectedspeciesname = __ref.getField(false,"_cbxespecie" /*RemoteObject*/ ).runMethod(true,"getSelectedItem");Debug.locals.put("selectedSpeciesName", _selectedspeciesname);Debug.locals.put("selectedSpeciesName", _selectedspeciesname);
 BA.debugLineNum = 60;BA.debugLine="Dim selectedSpeciesId As Int = speciesMap.Get(sel";
Debug.ShouldStop(134217728);
_selectedspeciesid = BA.numberCast(int.class, __ref.getField(false,"_speciesmap" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_selectedspeciesname))));Debug.locals.put("selectedSpeciesId", _selectedspeciesid);Debug.locals.put("selectedSpeciesId", _selectedspeciesid);
 BA.debugLineNum = 62;BA.debugLine="Wait For (apiAnimales.Update(txtId.Text, txtNombr";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "pageanimal", "btnput_click"), __ref.getField(false,"_apianimales" /*RemoteObject*/ ).runClassMethod (b4a.example.animalrepository.class, "_update" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_txtdescripcion" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(_selectedspeciesid)));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_e = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("e", _e);
;
 BA.debugLineNum = 63;BA.debugLine="If e = True Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_e,parent.__c.getField(true,"True"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 64;BA.debugLine="Msgbox(\"Actualizado animal\", \"OK\")";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Actualizado animal")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 66;BA.debugLine="Msgbox(\"No se pudo actualizar el registro\", \"Err";
Debug.ShouldStop(2);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se pudo actualizar el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _btnregresar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnRegresar_Click (pageanimal) ","pageanimal",3,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("btnregresar_click")) { return __ref.runUserSub(false, "pageanimal","btnregresar_click", __ref);}
 BA.debugLineNum = 83;BA.debugLine="Private Sub btnRegresar_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(524288);
pageanimal._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cbxespecie_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("cbxEspecie_ItemClick (pageanimal) ","pageanimal",3,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("cbxespecie_itemclick")) { return __ref.runUserSub(false, "pageanimal","cbxespecie_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 45;BA.debugLine="Private Sub cbxEspecie_ItemClick(Position As Int,";
Debug.ShouldStop(4096);
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
pageanimal._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",pageanimal._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
pageanimal._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",pageanimal._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private txtId As EditText";
pageanimal._txtid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtid",pageanimal._txtid);
 //BA.debugLineNum = 5;BA.debugLine="Private apiEspecies As EspecieRepository";
pageanimal._apiespecies = RemoteObject.createNew ("b4a.example.especierepository");__ref.setField("_apiespecies",pageanimal._apiespecies);
 //BA.debugLineNum = 6;BA.debugLine="Private apiAnimales As AnimalRepository";
pageanimal._apianimales = RemoteObject.createNew ("b4a.example.animalrepository");__ref.setField("_apianimales",pageanimal._apianimales);
 //BA.debugLineNum = 7;BA.debugLine="Private txtNombre As EditText";
pageanimal._txtnombre = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtnombre",pageanimal._txtnombre);
 //BA.debugLineNum = 8;BA.debugLine="Private txtDescripcion As EditText";
pageanimal._txtdescripcion = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtdescripcion",pageanimal._txtdescripcion);
 //BA.debugLineNum = 9;BA.debugLine="Private cbxEspecie As Spinner";
pageanimal._cbxespecie = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_cbxespecie",pageanimal._cbxespecie);
 //BA.debugLineNum = 10;BA.debugLine="Private speciesMap As Map";
pageanimal._speciesmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_speciesmap",pageanimal._speciesmap);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (pageanimal) ","pageanimal",3,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "pageanimal","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="speciesMap.Initialize";
Debug.ShouldStop(16384);
__ref.getField(false,"_speciesmap" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 16;BA.debugLine="Return Me";
Debug.ShouldStop(32768);
if (true) return __ref;
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}