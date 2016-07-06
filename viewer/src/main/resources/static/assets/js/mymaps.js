function initMap() {
  var map = new google.maps.Map(document.getElementById('map'), {
    zoom: 6,
    center: {lat: 41.876, lng: -87.624}
  });

  var ctaLayer = new google.maps.KmlLayer({
    url: 'https://raw.githubusercontent.com/raphsoft/test-visualization/master/kml/volcano_resumen.kml',
    map: map
  });

  var ctaLayer = new google.maps.KmlLayer({
    url: 'https://raw.githubusercontent.com/raphsoft/test-visualization/7d60b4806287444e604888499fdc033117a57a5b/kml/tsunami_tragic_resume.kml',
    map: map
  });
}