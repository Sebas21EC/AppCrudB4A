package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class pageanimal extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.pageanimal");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.pageanimal.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.EditTextWrapper _txtid = null;
public b4a.example.especierepository _apiespecies = null;
public b4a.example.animalrepository _apianimales = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtnombre = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtdescripcion = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _cbxespecie = null;
public anywheresoftware.b4a.objects.collections.Map _speciesmap = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public Object  _initialize(b4a.example.pageanimal __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="pageanimal";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="speciesMap.Initialize";
__ref._speciesmap /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="End Sub";
return null;
}
public void  _b4xpage_created(b4a.example.pageanimal __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
RDebugUtils.currentModule="pageanimal";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}); return;}
ResumableSub_B4XPage_Created rsub = new ResumableSub_B4XPage_Created(this,__ref,_root1);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XPage_Created extends BA.ResumableSub {
public ResumableSub_B4XPage_Created(b4a.example.pageanimal parent,b4a.example.pageanimal __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) {
this.parent = parent;
this.__ref = __ref;
this._root1 = _root1;
this.__ref = parent;
}
b4a.example.pageanimal __ref;
b4a.example.pageanimal parent;
anywheresoftware.b4a.objects.B4XViewWrapper _root1;
anywheresoftware.b4a.objects.collections.List _species = null;
b4a.example.especie _specie = null;
anywheresoftware.b4a.BA.IterableList group9;
int index9;
int groupLen9;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="pageanimal";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="Root.LoadLayout(\"PageAnimal\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("PageAnimal",ba);
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="apiAnimales.Initialize(\"https://appanimalesapi202";
__ref._apianimales /*b4a.example.animalrepository*/ ._initialize /*String*/ (null,ba,"https://appanimalesapi2024trujillo.azurewebsites.net/api/Animales");
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="apiEspecies.Initialize(\"https://appanimalesapi202";
__ref._apiespecies /*b4a.example.especierepository*/ ._initialize /*String*/ (null,ba,"https://appanimalesapi2024trujillo.azurewebsites.net/api/Grupos");
RDebugUtils.currentLine=1638408;
 //BA.debugLineNum = 1638408;BA.debugLine="Wait For (apiEspecies.RedAll) Complete (species A";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "pageanimal", "b4xpage_created"), __ref._apiespecies /*b4a.example.especierepository*/ ._redall /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_species = (anywheresoftware.b4a.objects.collections.List) result[1];
;
RDebugUtils.currentLine=1638409;
 //BA.debugLineNum = 1638409;BA.debugLine="If species <> Null Then";
if (true) break;

case 1:
//if
this.state = 16;
if (_species!= null) { 
this.state = 3;
}else {
this.state = 15;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=1638410;
 //BA.debugLineNum = 1638410;BA.debugLine="Log(\"Número de especies cargadas: \" & species.Si";
parent.__c.LogImpl("61638410","Número de especies cargadas: "+BA.NumberToString(_species.getSize()),0);
RDebugUtils.currentLine=1638411;
 //BA.debugLineNum = 1638411;BA.debugLine="If species.Size > 0 Then";
if (true) break;

case 4:
//if
this.state = 13;
if (_species.getSize()>0) { 
this.state = 6;
}else {
this.state = 12;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=1638412;
 //BA.debugLineNum = 1638412;BA.debugLine="For Each specie As Especie In species";
if (true) break;

case 7:
//for
this.state = 10;
group9 = _species;
index9 = 0;
groupLen9 = group9.getSize();
this.state = 18;
if (true) break;

case 18:
//C
this.state = 10;
if (index9 < groupLen9) {
this.state = 9;
_specie = (b4a.example.especie)(group9.Get(index9));}
if (true) break;

case 19:
//C
this.state = 18;
index9++;
if (true) break;

case 9:
//C
this.state = 19;
RDebugUtils.currentLine=1638413;
 //BA.debugLineNum = 1638413;BA.debugLine="cbxEspecie.Add(specie.Nombre)";
__ref._cbxespecie /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(_specie._nombre /*String*/ );
RDebugUtils.currentLine=1638414;
 //BA.debugLineNum = 1638414;BA.debugLine="speciesMap.Put(specie.Nombre, specie.Id) ' Sav";
__ref._speciesmap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_specie._nombre /*String*/ ),(Object)(_specie._id /*int*/ ));
RDebugUtils.currentLine=1638415;
 //BA.debugLineNum = 1638415;BA.debugLine="Log(\"Especie agregada al Spinner: \" & specie.N";
parent.__c.LogImpl("61638415","Especie agregada al Spinner: "+_specie._nombre /*String*/ ,0);
 if (true) break;
if (true) break;

case 10:
//C
this.state = 13;
;
 if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=1638418;
 //BA.debugLineNum = 1638418;BA.debugLine="Log(\"No se encontraron especies.\")";
parent.__c.LogImpl("61638418","No se encontraron especies.",0);
 if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=1638421;
 //BA.debugLineNum = 1638421;BA.debugLine="Log(\"No se pudieron obtener especies.\")";
parent.__c.LogImpl("61638421","No se pudieron obtener especies.",0);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=1638423;
 //BA.debugLineNum = 1638423;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btndelete_click(b4a.example.pageanimal __ref) throws Exception{
RDebugUtils.currentModule="pageanimal";
if (Debug.shouldDelegate(ba, "btndelete_click", false))
	 {Debug.delegate(ba, "btndelete_click", null); return;}
ResumableSub_btnDelete_Click rsub = new ResumableSub_btnDelete_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnDelete_Click extends BA.ResumableSub {
public ResumableSub_btnDelete_Click(b4a.example.pageanimal parent,b4a.example.pageanimal __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.pageanimal __ref;
b4a.example.pageanimal parent;
boolean _r = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="pageanimal";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Wait For (apiAnimales.Delete(txtId.Text)) Complet";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "pageanimal", "btndelete_click"), __ref._apianimales /*b4a.example.animalrepository*/ ._delete /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_r = (Boolean) result[1];
;
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="If r = True Then";
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
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="Msgbox(\"El registro se eliminó correctamente\", \"";
parent.__c.Msgbox(BA.ObjectToCharSequence("El registro se eliminó correctamente"),BA.ObjectToCharSequence("Ok"),ba);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="Msgbox(\"No se pudo eliminar el registro\", \"Error";
parent.__c.Msgbox(BA.ObjectToCharSequence("No se pudo eliminar el registro"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=1769479;
 //BA.debugLineNum = 1769479;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btnget_click(b4a.example.pageanimal __ref) throws Exception{
RDebugUtils.currentModule="pageanimal";
if (Debug.shouldDelegate(ba, "btnget_click", false))
	 {Debug.delegate(ba, "btnget_click", null); return;}
ResumableSub_btnGet_Click rsub = new ResumableSub_btnGet_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnGet_Click extends BA.ResumableSub {
public ResumableSub_btnGet_Click(b4a.example.pageanimal parent,b4a.example.pageanimal __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.pageanimal __ref;
b4a.example.pageanimal parent;
b4a.example.animal _e = null;
int _i = 0;
int step10;
int limit10;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="pageanimal";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="Wait For (apiAnimales.ReadById(txtId.Text)) Compl";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "pageanimal", "btnget_click"), __ref._apianimales /*b4a.example.animalrepository*/ ._readbyid /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_e = (b4a.example.animal) result[1];
;
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="If e.Id > 0 Then";
if (true) break;

case 1:
//if
this.state = 14;
if (_e._id /*int*/ >0) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="Log(e.Id)";
parent.__c.LogImpl("62031619",BA.NumberToString(_e._id /*int*/ ),0);
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="txtId.Text = e.Id";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_e._id /*int*/ ));
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="Log(e.Nombre)";
parent.__c.LogImpl("62031621",_e._nombre /*String*/ ,0);
RDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="txtNombre.Text = e.Nombre";
__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_e._nombre /*String*/ ));
RDebugUtils.currentLine=2031623;
 //BA.debugLineNum = 2031623;BA.debugLine="Log(e.Descripcion)";
parent.__c.LogImpl("62031623",_e._descripcion /*String*/ ,0);
RDebugUtils.currentLine=2031624;
 //BA.debugLineNum = 2031624;BA.debugLine="txtDescripcion.Text = e.Descripcion";
__ref._txtdescripcion /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_e._descripcion /*String*/ ));
RDebugUtils.currentLine=2031625;
 //BA.debugLineNum = 2031625;BA.debugLine="Log(e.Id_Especie)";
parent.__c.LogImpl("62031625",BA.NumberToString(_e._id_especie /*int*/ ),0);
RDebugUtils.currentLine=2031628;
 //BA.debugLineNum = 2031628;BA.debugLine="For i = 0 To cbxEspecie.Size - 1";
if (true) break;

case 4:
//for
this.state = 11;
step10 = 1;
limit10 = (int) (__ref._cbxespecie /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSize()-1);
_i = (int) (0) ;
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
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=2031629;
 //BA.debugLineNum = 2031629;BA.debugLine="If speciesMap.Get(cbxEspecie.GetItem(i)) = e.Id";
if (true) break;

case 7:
//if
this.state = 10;
if ((__ref._speciesmap /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(__ref._cbxespecie /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .GetItem(_i)))).equals((Object)(_e._id_especie /*int*/ ))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=2031630;
 //BA.debugLineNum = 2031630;BA.debugLine="cbxEspecie.SelectedIndex = i";
__ref._cbxespecie /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex(_i);
RDebugUtils.currentLine=2031631;
 //BA.debugLineNum = 2031631;BA.debugLine="Exit";
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
;
RDebugUtils.currentLine=2031635;
 //BA.debugLineNum = 2031635;BA.debugLine="Msgbox(\"El registro se encontró y se cargó en lo";
parent.__c.Msgbox(BA.ObjectToCharSequence("El registro se encontró y se cargó en los cuadros de texto"),BA.ObjectToCharSequence("Ok"),ba);
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=2031637;
 //BA.debugLineNum = 2031637;BA.debugLine="Msgbox(\"No se pudo encontrar el registro\", \"Erro";
parent.__c.Msgbox(BA.ObjectToCharSequence("No se pudo encontrar el registro"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=2031639;
 //BA.debugLineNum = 2031639;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btngetall_click(b4a.example.pageanimal __ref) throws Exception{
RDebugUtils.currentModule="pageanimal";
if (Debug.shouldDelegate(ba, "btngetall_click", false))
	 {Debug.delegate(ba, "btngetall_click", null); return;}
ResumableSub_btnGetAll_Click rsub = new ResumableSub_btnGetAll_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnGetAll_Click extends BA.ResumableSub {
public ResumableSub_btnGetAll_Click(b4a.example.pageanimal parent,b4a.example.pageanimal __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.pageanimal __ref;
b4a.example.pageanimal parent;
anywheresoftware.b4a.objects.collections.List _r = null;
b4a.example.animal _d = null;
anywheresoftware.b4a.BA.IterableList group3;
int index3;
int groupLen3;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="pageanimal";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Wait For (apiAnimales.ReadAll) Complete (r As Lis";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "pageanimal", "btngetall_click"), __ref._apianimales /*b4a.example.animalrepository*/ ._readall /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_r = (anywheresoftware.b4a.objects.collections.List) result[1];
;
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="If r.Size > 0 Then";
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
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="For Each d As Animal In r";
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
_d = (b4a.example.animal)(group3.Get(index3));}
if (true) break;

case 13:
//C
this.state = 12;
index3++;
if (true) break;

case 6:
//C
this.state = 13;
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="Log(\"--------------\")";
parent.__c.LogImpl("62097156","--------------",0);
RDebugUtils.currentLine=2097157;
 //BA.debugLineNum = 2097157;BA.debugLine="Log(d.Id)";
parent.__c.LogImpl("62097157",BA.NumberToString(_d._id /*int*/ ),0);
RDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="Log(d.Nombre)";
parent.__c.LogImpl("62097158",_d._nombre /*String*/ ,0);
RDebugUtils.currentLine=2097159;
 //BA.debugLineNum = 2097159;BA.debugLine="Log(d.Descripcion)";
parent.__c.LogImpl("62097159",_d._descripcion /*String*/ ,0);
RDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="Log(d.Id_Especie)";
parent.__c.LogImpl("62097160",BA.NumberToString(_d._id_especie /*int*/ ),0);
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
;
RDebugUtils.currentLine=2097162;
 //BA.debugLineNum = 2097162;BA.debugLine="Msgbox(\"Los datos han sido leídos, solo pueden v";
parent.__c.Msgbox(BA.ObjectToCharSequence("Los datos han sido leídos, solo pueden verse en consola"),BA.ObjectToCharSequence("Ok"),ba);
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=2097164;
 //BA.debugLineNum = 2097164;BA.debugLine="Msgbox(\"No se pudieron leer los registros\", \"Err";
parent.__c.Msgbox(BA.ObjectToCharSequence("No se pudieron leer los registros"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=2097166;
 //BA.debugLineNum = 2097166;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btnpost_click(b4a.example.pageanimal __ref) throws Exception{
RDebugUtils.currentModule="pageanimal";
if (Debug.shouldDelegate(ba, "btnpost_click", false))
	 {Debug.delegate(ba, "btnpost_click", null); return;}
ResumableSub_btnPost_Click rsub = new ResumableSub_btnPost_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnPost_Click extends BA.ResumableSub {
public ResumableSub_btnPost_Click(b4a.example.pageanimal parent,b4a.example.pageanimal __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.pageanimal __ref;
b4a.example.pageanimal parent;
String _selectedspeciesname = "";
int _selectedspeciesid = 0;
b4a.example.animal _e = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="pageanimal";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Dim selectedSpeciesName As String = cbxEspecie.Se";
_selectedspeciesname = __ref._cbxespecie /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedItem();
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="Dim selectedSpeciesId As Int = speciesMap.Get(sel";
_selectedspeciesid = (int)(BA.ObjectToNumber(__ref._speciesmap /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_selectedspeciesname))));
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="Wait For (apiAnimales.Create(0, txtNombre.Text, t";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "pageanimal", "btnpost_click"), __ref._apianimales /*b4a.example.animalrepository*/ ._create /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int) (0),__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),__ref._txtdescripcion /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),_selectedspeciesid));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_e = (b4a.example.animal) result[1];
;
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="If e.Id > 0 Then";
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
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="Log(\"Nuevo id: \" & e.Id)";
parent.__c.LogImpl("61900550","Nuevo id: "+BA.NumberToString(_e._id /*int*/ ),0);
RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="Msgbox(\"Insertado nuevo animal: (\" & e.Id & \" :";
parent.__c.Msgbox(BA.ObjectToCharSequence("Insertado nuevo animal: ("+BA.NumberToString(_e._id /*int*/ )+" : "+_e._nombre /*String*/ +")"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=1900553;
 //BA.debugLineNum = 1900553;BA.debugLine="Msgbox(\"No se pudo insertar el registro\", \"Error";
parent.__c.Msgbox(BA.ObjectToCharSequence("No se pudo insertar el registro"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=1900555;
 //BA.debugLineNum = 1900555;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btnput_click(b4a.example.pageanimal __ref) throws Exception{
RDebugUtils.currentModule="pageanimal";
if (Debug.shouldDelegate(ba, "btnput_click", false))
	 {Debug.delegate(ba, "btnput_click", null); return;}
ResumableSub_btnPut_Click rsub = new ResumableSub_btnPut_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnPut_Click extends BA.ResumableSub {
public ResumableSub_btnPut_Click(b4a.example.pageanimal parent,b4a.example.pageanimal __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.pageanimal __ref;
b4a.example.pageanimal parent;
String _selectedspeciesname = "";
int _selectedspeciesid = 0;
boolean _e = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="pageanimal";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Dim selectedSpeciesName As String = cbxEspecie.Se";
_selectedspeciesname = __ref._cbxespecie /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedItem();
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="Dim selectedSpeciesId As Int = speciesMap.Get(sel";
_selectedspeciesid = (int)(BA.ObjectToNumber(__ref._speciesmap /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_selectedspeciesname))));
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="Wait For (apiAnimales.Update(txtId.Text, txtNombr";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "pageanimal", "btnput_click"), __ref._apianimales /*b4a.example.animalrepository*/ ._update /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())),__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),__ref._txtdescripcion /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),_selectedspeciesid));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_e = (Boolean) result[1];
;
RDebugUtils.currentLine=1835013;
 //BA.debugLineNum = 1835013;BA.debugLine="If e = True Then";
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
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="Msgbox(\"Actualizado animal\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Actualizado animal"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=1835016;
 //BA.debugLineNum = 1835016;BA.debugLine="Msgbox(\"No se pudo actualizar el registro\", \"Err";
parent.__c.Msgbox(BA.ObjectToCharSequence("No se pudo actualizar el registro"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=1835018;
 //BA.debugLineNum = 1835018;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnregresar_click(b4a.example.pageanimal __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pageanimal";
if (Debug.shouldDelegate(ba, "btnregresar_click", false))
	 {return ((String) Debug.delegate(ba, "btnregresar_click", null));}
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Private Sub btnRegresar_Click";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="End Sub";
return "";
}
public String  _cbxespecie_itemclick(b4a.example.pageanimal __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="pageanimal";
if (Debug.shouldDelegate(ba, "cbxespecie_itemclick", false))
	 {return ((String) Debug.delegate(ba, "cbxespecie_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Private Sub cbxEspecie_ItemClick(Position As Int,";
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.pageanimal __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pageanimal";
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="Private txtId As EditText";
_txtid = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="Private apiEspecies As EspecieRepository";
_apiespecies = new b4a.example.especierepository();
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="Private apiAnimales As AnimalRepository";
_apianimales = new b4a.example.animalrepository();
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="Private txtNombre As EditText";
_txtnombre = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=1507335;
 //BA.debugLineNum = 1507335;BA.debugLine="Private txtDescripcion As EditText";
_txtdescripcion = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=1507336;
 //BA.debugLineNum = 1507336;BA.debugLine="Private cbxEspecie As Spinner";
_cbxespecie = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=1507337;
 //BA.debugLineNum = 1507337;BA.debugLine="Private speciesMap As Map";
_speciesmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1507338;
 //BA.debugLineNum = 1507338;BA.debugLine="End Sub";
return "";
}
}