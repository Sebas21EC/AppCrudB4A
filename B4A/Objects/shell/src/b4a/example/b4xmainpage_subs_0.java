package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 19;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="Root = Root1";
Debug.ShouldStop(524288);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 21;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnanimal_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnAnimal_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("btnanimal_click")) { return __ref.runUserSub(false, "b4xmainpage","btnanimal_click", __ref);}
RemoteObject _page_animal = RemoteObject.declareNull("b4a.example.pageanimal");
 BA.debugLineNum = 33;BA.debugLine="Private Sub btnAnimal_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="Dim page_animal As PageAnimal";
Debug.ShouldStop(2);
_page_animal = RemoteObject.createNew ("b4a.example.pageanimal");Debug.locals.put("page_animal", _page_animal);
 BA.debugLineNum = 35;BA.debugLine="page_animal.Initialize";
Debug.ShouldStop(4);
_page_animal.runClassMethod (b4a.example.pageanimal.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 36;BA.debugLine="B4XPages.AddPage(\"PageAnimal\",page_animal)";
Debug.ShouldStop(8);
b4xmainpage._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("PageAnimal")),(Object)((_page_animal)));
 BA.debugLineNum = 37;BA.debugLine="B4XPages.ShowPage(\"PageAnimal\")";
Debug.ShouldStop(16);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("PageAnimal")));
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnespecie_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnEspecie_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("btnespecie_click")) { return __ref.runUserSub(false, "b4xmainpage","btnespecie_click", __ref);}
RemoteObject _page_especie = RemoteObject.declareNull("b4a.example.pageespecie");
 BA.debugLineNum = 26;BA.debugLine="Private Sub btnEspecie_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="Dim page_especie As PageEspecie";
Debug.ShouldStop(67108864);
_page_especie = RemoteObject.createNew ("b4a.example.pageespecie");Debug.locals.put("page_especie", _page_especie);
 BA.debugLineNum = 28;BA.debugLine="page_especie.Initialize";
Debug.ShouldStop(134217728);
_page_especie.runClassMethod (b4a.example.pageespecie.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 29;BA.debugLine="B4XPages.AddPage(\"PageEspecie\",page_especie)";
Debug.ShouldStop(268435456);
b4xmainpage._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("PageEspecie")),(Object)((_page_especie)));
 BA.debugLineNum = 30;BA.debugLine="B4XPages.ShowPage(\"PageEspecie\")";
Debug.ShouldStop(536870912);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("PageEspecie")));
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(8192);
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}