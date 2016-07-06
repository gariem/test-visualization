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
    url: 'https://raw.githubusercontent.com/raphsoft/test-visualization/master/kml/tsunami_tragic_resume.kml',
    map: map
  });
}