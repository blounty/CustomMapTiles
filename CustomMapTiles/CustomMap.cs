using System;
using Xamarin.Forms.Maps;

namespace CustomMapTiles
{
    public class CustomMap 
        : Map
    {
        public string MapTileTemplate
        {
            get;
            set;
        }
    }
}

