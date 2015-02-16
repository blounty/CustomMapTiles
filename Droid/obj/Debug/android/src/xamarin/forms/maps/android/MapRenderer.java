package xamarin.forms.maps.android;


public class MapRenderer
	extends xamarin.forms.platform.android.ViewRenderer
	implements
		mono.android.IGCUserPeer,
		com.google.android.gms.maps.GoogleMap.OnCameraChangeListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onLayout:(ZIIII)V:GetOnLayout_ZIIIIHandler\n" +
			"n_onCameraChange:(Lcom/google/android/gms/maps/model/CameraPosition;)V:GetOnCameraChange_Lcom_google_android_gms_maps_model_CameraPosition_Handler:Android.Gms.Maps.GoogleMap/IOnCameraChangeListenerInvoker, GooglePlayServicesLib\n" +
			"";
		mono.android.Runtime.register ("Xamarin.Forms.Maps.Android.MapRenderer, Xamarin.Forms.Maps.Android, Version=1.3.3.0, Culture=neutral, PublicKeyToken=null", MapRenderer.class, __md_methods);
	}


	public MapRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2) throws java.lang.Throwable
	{
		super (p0, p1, p2);
		if (getClass () == MapRenderer.class)
			mono.android.TypeManager.Activate ("Xamarin.Forms.Maps.Android.MapRenderer, Xamarin.Forms.Maps.Android, Version=1.3.3.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public MapRenderer (android.content.Context p0, android.util.AttributeSet p1) throws java.lang.Throwable
	{
		super (p0, p1);
		if (getClass () == MapRenderer.class)
			mono.android.TypeManager.Activate ("Xamarin.Forms.Maps.Android.MapRenderer, Xamarin.Forms.Maps.Android, Version=1.3.3.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public MapRenderer (android.content.Context p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == MapRenderer.class)
			mono.android.TypeManager.Activate ("Xamarin.Forms.Maps.Android.MapRenderer, Xamarin.Forms.Maps.Android, Version=1.3.3.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public void onLayout (boolean p0, int p1, int p2, int p3, int p4)
	{
		n_onLayout (p0, p1, p2, p3, p4);
	}

	private native void n_onLayout (boolean p0, int p1, int p2, int p3, int p4);


	public void onCameraChange (com.google.android.gms.maps.model.CameraPosition p0)
	{
		n_onCameraChange (p0);
	}

	private native void n_onCameraChange (com.google.android.gms.maps.model.CameraPosition p0);

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
