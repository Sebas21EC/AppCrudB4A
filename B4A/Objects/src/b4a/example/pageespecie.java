package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class pageespecie extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.pageespecie");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.pageespecie.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example.especierepository _apiespecies = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtid = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtnombre = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtcaracteristica = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public Object  _initialize(b4a.example.pageespecie __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="pageespecie";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4a.example.pageespecie __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="pageespecie";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="Root.LoadLayout(\"PageEspecie\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("PageEspecie",ba);
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="apiEspecies.Initialize(\"https://appanimalesapi202";
__ref._apiespecies /*b4a.example.especierepository*/ ._initialize /*String*/ (null,ba,"https://appanimalesapi2024trujillo.azurewebsites.net/api/Grupos");
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="End Sub";
return "";
}
public void  _btndelete_click(b4a.example.pageespecie __ref) throws Exception{
RDebugUtils.currentModule="pageespecie";
if (Debug.shouldDelegate(ba, "btndelete_click", false))
	 {Debug.delegate(ba, "btndelete_click", null); return;}
ResumableSub_btnDelete_Click rsub = new ResumableSub_btnDelete_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnDelete_Click extends BA.ResumableSub {
public ResumableSub_btnDelete_Click(b4a.example.pageespecie parent,b4a.example.pageespecie __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.pageespecie __ref;
b4a.example.pageespecie parent;
boolean _r = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="pageespecie";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Wait For (apiEspecies.Delete(txtId.Text)) Complet";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "pageespecie", "btndelete_click"), __ref._apiespecies /*b4a.example.especierepository*/ ._delete /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_r = (Boolean) result[1];
;
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="If r = True Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_r==parent.__c.True) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="Msgbox(\"El registro se eliminó correctamente\", \"";
parent.__c.Msgbox(BA.ObjectToCharSequence("El registro se eliminó correctamente"),BA.ObjectToCharSequence("Ok"),ba);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="Msgbox(\"No se pudo eliminar el registro\", \"Error";
parent.__c.Msgbox(BA.ObjectToCharSequence("No se pudo eliminar el registro"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=1114121;
 //BA.debugLineNum = 1114121;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btnget_click(b4a.example.pageespecie __ref) throws Exception{
RDebugUtils.currentModule="pageespecie";
if (Debug.shouldDelegate(ba, "btnget_click", false))
	 {Debug.delegate(ba, "btnget_click", null); return;}
ResumableSub_btnGet_Click rsub = new ResumableSub_btnGet_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnGet_Click extends BA.ResumableSub {
public ResumableSub_btnGet_Click(b4a.example.pageespecie parent,b4a.example.pageespecie __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.pageespecie __ref;
b4a.example.pageespecie parent;
b4a.example.especie _e = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="pageespecie";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Wait For (apiEspecies.ReadByiD(txtId.Text)) Compl";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "pageespecie", "btnget_click"), __ref._apiespecies /*b4a.example.especierepository*/ ._readbyid /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_e = (b4a.example.especie) result[1];
;
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="If e.Id > 0 Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_e._id /*int*/ >0) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="Log(e.Id)";
parent.__c.LogImpl("61376260",BA.NumberToString(_e._id /*int*/ ),0);
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="txtId.Text=e.Id";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_e._id /*int*/ ));
RDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="Log(e.Nombre)";
parent.__c.LogImpl("61376262",_e._nombre /*String*/ ,0);
RDebugUtils.currentLine=1376263;
 //BA.debugLineNum = 1376263;BA.debugLine="txtNombre.Text=e.Nombre";
__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_e._nombre /*String*/ ));
RDebugUtils.currentLine=1376264;
 //BA.debugLineNum = 1376264;BA.debugLine="Log(e.Caracteristica)";
parent.__c.LogImpl("61376264",_e._caracteristica /*String*/ ,0);
RDebugUtils.currentLine=1376265;
 //BA.debugLineNum = 1376265;BA.debugLine="txtCaracteristica.Text= e.Caracteristica";
__ref._txtcaracteristica /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_e._caracteristica /*String*/ ));
RDebugUtils.currentLine=1376266;
 //BA.debugLineNum = 1376266;BA.debugLine="Msgbox(\"El registro se encontró y se cargo en lo";
parent.__c.Msgbox(BA.ObjectToCharSequence("El registro se encontró y se cargo en los cuadros de texto"),BA.ObjectToCharSequence("Ok"),ba);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=1376268;
 //BA.debugLineNum = 1376268;BA.debugLine="Msgbox(\"No se pudo encontrar el registro\", \"Erro";
parent.__c.Msgbox(BA.ObjectToCharSequence("No se pudo encontrar el registro"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=1376270;
 //BA.debugLineNum = 1376270;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btngetall_click(b4a.example.pageespecie __ref) throws Exception{
RDebugUtils.currentModule="pageespecie";
if (Debug.shouldDelegate(ba, "btngetall_click", false))
	 {Debug.delegate(ba, "btngetall_click", null); return;}
ResumableSub_btnGetAll_Click rsub = new ResumableSub_btnGetAll_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnGetAll_Click extends BA.ResumableSub {
public ResumableSub_btnGetAll_Click(b4a.example.pageespecie parent,b4a.example.pageespecie __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.pageespecie __ref;
b4a.example.pageespecie parent;
anywheresoftware.b4a.objects.collections.List _r = null;
b4a.example.especie _d = null;
anywheresoftware.b4a.BA.IterableList group3;
int index3;
int groupLen3;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="pageespecie";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Wait For (apiEspecies.RedAll) Complete (r As List";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "pageespecie", "btngetall_click"), __ref._apiespecies /*b4a.example.especierepository*/ ._redall /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_r = (anywheresoftware.b4a.objects.collections.List) result[1];
;
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="If r.Size > 0 Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_r.getSize()>0) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="For Each d As Especie In r";
if (true) break;

case 4:
//for
this.state = 7;
group3 = _r;
index3 = 0;
groupLen3 = group3.getSize();
this.state = 12;
if (true) break;

case 12:
//C
this.state = 7;
if (index3 < groupLen3) {
this.state = 6;
_d = (b4a.example.especie)(group3.Get(index3));}
if (true) break;

case 13:
//C
this.state = 12;
index3++;
if (true) break;

case 6:
//C
this.state = 13;
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="Log(\"--------------\")";
parent.__c.LogImpl("61441797","--------------",0);
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="Log(d.Id)";
parent.__c.LogImpl("61441799",BA.NumberToString(_d._id /*int*/ ),0);
RDebugUtils.currentLine=1441800;
 //BA.debugLineNum = 1441800;BA.debugLine="Log(d.Nombre)";
parent.__c.LogImpl("61441800",_d._nombre /*String*/ ,0);
RDebugUtils.currentLine=1441801;
 //BA.debugLineNum = 1441801;BA.debugLine="Log(d.Caracteristica)";
parent.__c.LogImpl("61441801",_d._caracteristica /*String*/ ,0);
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
;
RDebugUtils.currentLine=1441804;
 //BA.debugLineNum = 1441804;BA.debugLine="Msgbox(\"Los datos han sido leídos, solo pueden v";
parent.__c.Msgbox(BA.ObjectToCharSequence("Los datos han sido leídos, solo pueden verse en consola"),BA.ObjectToCharSequence("Ok"),ba);
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=1441806;
 //BA.debugLineNum = 1441806;BA.debugLine="Msgbox(\"No se pudo insertar el registro\", \"Error";
parent.__c.Msgbox(BA.ObjectToCharSequence("No se pudo insertar el registro"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=1441808;
 //BA.debugLineNum = 1441808;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btnpost_click(b4a.example.pageespecie __ref) throws Exception{
RDebugUtils.currentModule="pageespecie";
if (Debug.shouldDelegate(ba, "btnpost_click", false))
	 {Debug.delegate(ba, "btnpost_click", null); return;}
ResumableSub_btnPost_Click rsub = new ResumableSub_btnPost_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnPost_Click extends BA.ResumableSub {
public ResumableSub_btnPost_Click(b4a.example.pageespecie parent,b4a.example.pageespecie __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.pageespecie __ref;
b4a.example.pageespecie parent;
b4a.example.especie _e = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="pageespecie";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="Wait For (apiEspecies.Create( 0, txtNombre.Text,t";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "pageespecie", "btnpost_click"), __ref._apiespecies /*b4a.example.especierepository*/ ._create /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int) (0),__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),__ref._txtcaracteristica /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_e = (b4a.example.especie) result[1];
;
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="If e.Id > 0 Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_e._id /*int*/ >0) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="Log(\"Nuevo id: \" & e.Id)";
parent.__c.LogImpl("61245188","Nuevo id: "+BA.NumberToString(_e._id /*int*/ ),0);
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="Msgbox(\"Insertado nueva especie: (\"&e.Id&\" : \"&e";
parent.__c.Msgbox(BA.ObjectToCharSequence("Insertado nueva especie: ("+BA.NumberToString(_e._id /*int*/ )+" : "+_e._nombre /*String*/ +")"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=1245191;
 //BA.debugLineNum = 1245191;BA.debugLine="Msgbox(\"No se pudo insertar el registro\", \"Error";
parent.__c.Msgbox(BA.ObjectToCharSequence("No se pudo insertar el registro"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=1245193;
 //BA.debugLineNum = 1245193;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btnput_click(b4a.example.pageespecie __ref) throws Exception{
RDebugUtils.currentModule="pageespecie";
if (Debug.shouldDelegate(ba, "btnput_click", false))
	 {Debug.delegate(ba, "btnput_click", null); return;}
ResumableSub_btnPut_Click rsub = new ResumableSub_btnPut_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnPut_Click extends BA.ResumableSub {
public ResumableSub_btnPut_Click(b4a.example.pageespecie parent,b4a.example.pageespecie __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.pageespecie __ref;
b4a.example.pageespecie parent;
boolean _e = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="pageespecie";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Wait For (apiEspecies.Update(txtId.Text, txtNombr";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "pageespecie", "btnput_click"), __ref._apiespecies /*b4a.example.especierepository*/ ._update /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())),__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),__ref._txtcaracteristica /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_e = (Boolean) result[1];
;
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="If e = True Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_e==parent.__c.True) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="Msgbox(\"Actualizado especie\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Actualizado especie"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="Msgbox(\"No se pudo actualizar el registro\", \"Err";
parent.__c.Msgbox(BA.ObjectToCharSequence("No se pudo actualizar el registro"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnregresar_click(b4a.example.pageespecie __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pageespecie";
if (Debug.shouldDelegate(ba, "btnregresar_click", false))
	 {return ((String) Debug.delegate(ba, "btnregresar_click", null));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Private Sub btnRegresar_Click";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.pageespecie __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pageespecie";
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="Private apiEspecies As EspecieRepository";
_apiespecies = new b4a.example.especierepository();
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="Private txtId As EditText";
_txtid = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="Private txtNombre As EditText";
_txtnombre = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="Private txtCaracteristica As EditText";
_txtcaracteristica = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="End Sub";
return "";
}
}