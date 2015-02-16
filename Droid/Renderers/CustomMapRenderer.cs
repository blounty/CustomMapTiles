using System;
using Xamarin.Forms.Maps.Android;
using Android.Gms.Maps;
using Android.Gms.Maps.Model;
using Xamarin.Forms;
using CustomMapTiles;
using CustomMapTiles.Droid.Renderers;

[assembly: ExportRenderer (typeof (CustomMap), typeof (CustomMapRenderer))]
namespace CustomMapTiles.Droid.Renderers
{
    public class CustomMapRenderer
    : MapRenderer
    {
        MapView map;
        CustomTileProvider tileProvider;
        CustomMap customMap;

        protected override void OnElementChanged(Xamarin.Forms.Platform.Android.ElementChangedEventArgs<Xamarin.Forms.View> e)
        {
            base.OnElementChanged(e);

            if (e.OldElement == null) {

                map = Control as MapView;
                customMap = e.NewElement as CustomMap;

                var tileProvider = new CustomTileProvider (512, 512, customMap.MapTileTemplate);
                var options = new TileOverlayOptions().InvokeTileProvider(tileProvider); 

                map.Map.AddTileOverlay (options);
            }
        }
    }
}

