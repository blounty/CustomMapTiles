package mono.com.google.android.gms.fitness.request;


public class OnDataPointListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.gms.fitness.request.OnDataPointListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onDataPoint:(Lcom/google/android/gms/fitness/data/DataPoint;)V:GetOnDataPoint_Lcom_google_android_gms_fitness_data_DataPoint_Handler:Android.Gms.Fitness.Request.IOnDataPointListenerInvoker, GooglePlayServicesLib\n" +
			"";
		mono.android.Runtime.register ("Android.Gms.Fitness.Request.IOnDataPointListenerImplementor, GooglePlayServicesLib, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", OnDataPointListenerImplementor.class, __md_methods);
	}


	public OnDataPointListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == OnDataPointListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Gms.Fitness.Request.IOnDataPointListenerImplementor, GooglePlayServicesLib, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onDataPoint (com.google.android.gms.fitness.data.DataPoint p0)
	{
		n_onDataPoint (p0);
	}

	private native void n_onDataPoint (com.google.android.gms.fitness.data.DataPoint p0);

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
