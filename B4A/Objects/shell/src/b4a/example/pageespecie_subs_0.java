package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class pageespecie_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (pageespecie) ","pageespecie",2,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "pageespecie","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 16;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="Root = Root1";
Debug.ShouldStop(65536);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 19;BA.debugLine="Root.LoadLayout(\"PageEspecie\")";
Debug.ShouldStop(262144);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("PageEspecie")),__ref.getField(false, "ba"));
 BA.debugLineNum = 20;BA.debugLine="apiEspecies.Initialize(\"https://appanimalesapi202";
Debug.ShouldStop(524288);
__ref.getField(false,"_apiespecies" /*RemoteObject*/ ).runClassMethod (b4a.example.especierepository.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("https://appanimalesapi2024trujillo.azurewebsites.net/api/Grupos")));
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btndelete_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnDelete_Click (pageespecie) ","pageespecie",2,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("btndelete_click")) { __ref.runUserSub(false, "pageespecie","btndelete_click", __ref); return;}
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
public ResumableSub_btnDelete_Click(b4a.example.pageespecie parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.pageespecie parent;
RemoteObject _r = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnDelete_Click (pageespecie) ","pageespecie",2,__ref.getField(false, "ba"),__ref,25);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 26;BA.debugLine="Wait For (apiEspecies.Delete(txtId.Text)) Complet";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "pageespecie", "btndelete_click"), __ref.getField(false,"_apiespecies" /*RemoteObject*/ ).runClassMethod (b4a.example.especierepository.class, "_delete" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_r = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("r", _r);
;
 BA.debugLineNum = 28;BA.debugLine="If r = True Then";
Debug.ShouldStop(134217728);
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
 BA.debugLineNum = 30;BA.debugLine="Msgbox(\"El registro se eliminó correctamente\", \"";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("El registro se eliminó correctamente")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Ok"))),__ref.getField(false, "ba"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 32;BA.debugLine="Msgbox(\"No se pudo eliminar el registro\", \"Error";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se pudo eliminar el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
public static void  _complete(RemoteObject __ref,RemoteObject _r) throws Exception{
}
public static void  _btnget_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnGet_Click (pageespecie) ","pageespecie",2,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("btnget_click")) { __ref.runUserSub(false, "pageespecie","btnget_click", __ref); return;}
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
public ResumableSub_btnGet_Click(b4a.example.pageespecie parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.pageespecie parent;
RemoteObject _e = RemoteObject.declareNull("b4a.example.especie");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnGet_Click (pageespecie) ","pageespecie",2,__ref.getField(false, "ba"),__ref,60);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 61;BA.debugLine="Wait For (apiEspecies.ReadByiD(txtId.Text)) Compl";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "pageespecie", "btnget_click"), __ref.getField(false,"_apiespecies" /*RemoteObject*/ ).runClassMethod (b4a.example.especierepository.class, "_readbyid" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_e = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("e", _e);
;
 BA.debugLineNum = 63;BA.debugLine="If e.Id > 0 Then";
Debug.ShouldStop(1073741824);
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
 BA.debugLineNum = 64;BA.debugLine="Log(e.Id)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","61376260",BA.NumberToString(_e.getField(true,"_id" /*RemoteObject*/ )),0);
 BA.debugLineNum = 65;BA.debugLine="txtId.Text=e.Id";
Debug.ShouldStop(1);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_e.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 66;BA.debugLine="Log(e.Nombre)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("LogImpl","61376262",_e.getField(true,"_nombre" /*RemoteObject*/ ),0);
 BA.debugLineNum = 67;BA.debugLine="txtNombre.Text=e.Nombre";
Debug.ShouldStop(4);
__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_e.getField(true,"_nombre" /*RemoteObject*/ )));
 BA.debugLineNum = 68;BA.debugLine="Log(e.Caracteristica)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","61376264",_e.getField(true,"_caracteristica" /*RemoteObject*/ ),0);
 BA.debugLineNum = 69;BA.debugLine="txtCaracteristica.Text= e.Caracteristica";
Debug.ShouldStop(16);
__ref.getField(false,"_txtcaracteristica" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_e.getField(true,"_caracteristica" /*RemoteObject*/ )));
 BA.debugLineNum = 70;BA.debugLine="Msgbox(\"El registro se encontró y se cargo en lo";
Debug.ShouldStop(32);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("El registro se encontró y se cargo en los cuadros de texto")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Ok"))),__ref.getField(false, "ba"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 72;BA.debugLine="Msgbox(\"No se pudo encontrar el registro\", \"Erro";
Debug.ShouldStop(128);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se pudo encontrar el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("btnGetAll_Click (pageespecie) ","pageespecie",2,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("btngetall_click")) { __ref.runUserSub(false, "pageespecie","btngetall_click", __ref); return;}
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
public ResumableSub_btnGetAll_Click(b4a.example.pageespecie parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.pageespecie parent;
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _d = RemoteObject.declareNull("b4a.example.especie");
RemoteObject group3;
int index3;
int groupLen3;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnGetAll_Click (pageespecie) ","pageespecie",2,__ref.getField(false, "ba"),__ref,77);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 78;BA.debugLine="Wait For (apiEspecies.RedAll) Complete (r As List";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "pageespecie", "btngetall_click"), __ref.getField(false,"_apiespecies" /*RemoteObject*/ ).runClassMethod (b4a.example.especierepository.class, "_redall" /*RemoteObject*/ ));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_r = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("r", _r);
;
 BA.debugLineNum = 80;BA.debugLine="If r.Size > 0 Then";
Debug.ShouldStop(32768);
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
 BA.debugLineNum = 81;BA.debugLine="For Each d As Especie In r";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 82;BA.debugLine="Log(\"--------------\")";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("LogImpl","61441797",RemoteObject.createImmutable("--------------"),0);
 BA.debugLineNum = 84;BA.debugLine="Log(d.Id)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","61441799",BA.NumberToString(_d.getField(true,"_id" /*RemoteObject*/ )),0);
 BA.debugLineNum = 85;BA.debugLine="Log(d.Nombre)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("LogImpl","61441800",_d.getField(true,"_nombre" /*RemoteObject*/ ),0);
 BA.debugLineNum = 86;BA.debugLine="Log(d.Caracteristica)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("LogImpl","61441801",_d.getField(true,"_caracteristica" /*RemoteObject*/ ),0);
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
Debug.locals.put("d", _d);
;
 BA.debugLineNum = 89;BA.debugLine="Msgbox(\"Los datos han sido leídos, solo pueden v";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Los datos han sido leídos, solo pueden verse en consola")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Ok"))),__ref.getField(false, "ba"));
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 91;BA.debugLine="Msgbox(\"No se pudo insertar el registro\", \"Error";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se pudo insertar el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("btnPost_Click (pageespecie) ","pageespecie",2,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("btnpost_click")) { __ref.runUserSub(false, "pageespecie","btnpost_click", __ref); return;}
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
public ResumableSub_btnPost_Click(b4a.example.pageespecie parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.pageespecie parent;
RemoteObject _e = RemoteObject.declareNull("b4a.example.especie");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnPost_Click (pageespecie) ","pageespecie",2,__ref.getField(false, "ba"),__ref,45);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 47;BA.debugLine="Wait For (apiEspecies.Create( 0, txtNombre.Text,t";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "pageespecie", "btnpost_click"), __ref.getField(false,"_apiespecies" /*RemoteObject*/ ).runClassMethod (b4a.example.especierepository.class, "_create" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_txtcaracteristica" /*RemoteObject*/ ).runMethod(true,"getText"))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_e = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("e", _e);
;
 BA.debugLineNum = 48;BA.debugLine="If e.Id > 0 Then";
Debug.ShouldStop(32768);
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
 BA.debugLineNum = 49;BA.debugLine="Log(\"Nuevo id: \" & e.Id)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","61245188",RemoteObject.concat(RemoteObject.createImmutable("Nuevo id: "),_e.getField(true,"_id" /*RemoteObject*/ )),0);
 BA.debugLineNum = 50;BA.debugLine="Msgbox(\"Insertado nueva especie: (\"&e.Id&\" : \"&e";
Debug.ShouldStop(131072);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Insertado nueva especie: ("),_e.getField(true,"_id" /*RemoteObject*/ ),RemoteObject.createImmutable(" : "),_e.getField(true,"_nombre" /*RemoteObject*/ ),RemoteObject.createImmutable(")")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 52;BA.debugLine="Msgbox(\"No se pudo insertar el registro\", \"Error";
Debug.ShouldStop(524288);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se pudo insertar el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("btnPut_Click (pageespecie) ","pageespecie",2,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("btnput_click")) { __ref.runUserSub(false, "pageespecie","btnput_click", __ref); return;}
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
public ResumableSub_btnPut_Click(b4a.example.pageespecie parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.pageespecie parent;
RemoteObject _e = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnPut_Click (pageespecie) ","pageespecie",2,__ref.getField(false, "ba"),__ref,36);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 37;BA.debugLine="Wait For (apiEspecies.Update(txtId.Text, txtNombr";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "pageespecie", "btnput_click"), __ref.getField(false,"_apiespecies" /*RemoteObject*/ ).runClassMethod (b4a.example.especierepository.class, "_update" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_txtcaracteristica" /*RemoteObject*/ ).runMethod(true,"getText"))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_e = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("e", _e);
;
 BA.debugLineNum = 38;BA.debugLine="If e = True Then";
Debug.ShouldStop(32);
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
 BA.debugLineNum = 39;BA.debugLine="Msgbox(\"Actualizado especie\", \"OK\")";
Debug.ShouldStop(64);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Actualizado especie")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 41;BA.debugLine="Msgbox(\"No se pudo actualizar el registro\", \"Err";
Debug.ShouldStop(256);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se pudo actualizar el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 6:
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
public static RemoteObject  _btnregresar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnRegresar_Click (pageespecie) ","pageespecie",2,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("btnregresar_click")) { return __ref.runUserSub(false, "pageespecie","btnregresar_click", __ref);}
 BA.debugLineNum = 56;BA.debugLine="Private Sub btnRegresar_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(16777216);
pageespecie._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
pageespecie._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",pageespecie._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
pageespecie._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",pageespecie._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private apiEspecies As EspecieRepository";
pageespecie._apiespecies = RemoteObject.createNew ("b4a.example.especierepository");__ref.setField("_apiespecies",pageespecie._apiespecies);
 //BA.debugLineNum = 5;BA.debugLine="Private txtId As EditText";
pageespecie._txtid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtid",pageespecie._txtid);
 //BA.debugLineNum = 6;BA.debugLine="Private txtNombre As EditText";
pageespecie._txtnombre = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtnombre",pageespecie._txtnombre);
 //BA.debugLineNum = 7;BA.debugLine="Private txtCaracteristica As EditText";
pageespecie._txtcaracteristica = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtcaracteristica",pageespecie._txtcaracteristica);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (pageespecie) ","pageespecie",2,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "pageespecie","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="Return Me";
Debug.ShouldStop(2048);
if (true) return __ref;
 BA.debugLineNum = 13;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}