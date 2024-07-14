
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class pageanimal {
    public static RemoteObject myClass;
	public pageanimal() {
	}
    public static PCBA staticBA = new PCBA(null, pageanimal.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _txtid = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _apiespecies = RemoteObject.declareNull("b4a.example.especierepository");
public static RemoteObject _apianimales = RemoteObject.declareNull("b4a.example.animalrepository");
public static RemoteObject _txtnombre = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtdescripcion = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _cbxespecie = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _speciesmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static b4a.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"apiAnimales",_ref.getField(false, "_apianimales"),"apiEspecies",_ref.getField(false, "_apiespecies"),"cbxEspecie",_ref.getField(false, "_cbxespecie"),"Root",_ref.getField(false, "_root"),"speciesMap",_ref.getField(false, "_speciesmap"),"txtDescripcion",_ref.getField(false, "_txtdescripcion"),"txtId",_ref.getField(false, "_txtid"),"txtNombre",_ref.getField(false, "_txtnombre"),"xui",_ref.getField(false, "_xui")};
}
}