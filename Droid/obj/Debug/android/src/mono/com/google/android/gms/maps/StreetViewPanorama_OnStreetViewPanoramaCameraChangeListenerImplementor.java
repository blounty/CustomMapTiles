package mono.com.google.android.gms.maps;


public class StreetViewPanorama_OnStreetViewPanoramaCameraChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onStreetViewPanoramaCameraChange:(Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;)V:GetOnStreetViewPanoramaCameraChange_Lcom_google_android_gms_maps_model_StreetViewPanoramaCamera_Handler:Android.Gms.Maps.StreetViewPanorama/IOnStreetViewPanoramaCameraChangeListenerInvoker, GooglePlayServicesLib\n" +
			"";
		mono.android.Runtime.register ("Android.Gms.Maps.StreetViewPanorama/IOnStreetViewPanoramaCameraChangeListenerImplementor, GooglePlayServicesLib, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", StreetViewPanorama_OnStreetViewPanoramaCameraChangeListenerImplementor.class, __md_methods);
	}


	public StreetViewPanorama_OnStreetViewPanoramaCameraChangeListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == StreetViewPanorama_OnStreetViewPanoramaCameraChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Gms.Maps.StreetViewPanorama/IOnStreetViewPanoramaCameraChangeListenerImplementor, GooglePlayServicesLib, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onStreetViewPanoramaCameraChange (com.google.android.gms.maps.model.StreetViewPanoramaCamera p0)
	{
		n_onStreetViewPanoramaCameraChange (p0);
	}

	private native void n_onStreetViewPanoramaCameraChange (com.google.android.gms.maps.model.StreetViewPanoramaCamera p0);

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
