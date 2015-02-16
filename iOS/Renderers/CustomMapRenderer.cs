using System;
using Xamarin.Forms.Maps.iOS;
using Xamarin.Forms;
using CustomMapTiles;
using CustomMapTiles.iOS.Renderers;
using MapKit;

[assembly: ExportRenderer (typeof (CustomMap), typeof (CustomMapRenderer))]

namespace CustomMapTiles.iOS.Renderers
{
    public class CustomMapRenderer
        : MapRenderer
    {

        MKMapView mapView;
        CustomMap customMap;

        protected override void OnElementChanged(Xamarin.Forms.Platform.iOS.ElementChangedEventArgs<View> e)
        {
            base.OnElementChanged(e);

            if (e.OldElement == null)
            {
                mapView = Control as MKMapView;
                customMap = e.NewElement as CustomMap;

                var overlay = new MKTileOverlay (customMap.MapTileTemplate);
                overlay.CanReplaceMapContent = false;
                overlay.GeometryFlipped = false;
                mapView.AddOverlay (overlay, MKOverlayLevel.AboveLabels);

                mapView.OverlayRenderer = (mv, o) =>
                new MKTileOverlayRenderer((MKTileOverlay)o);
            }
        }
    }
}

