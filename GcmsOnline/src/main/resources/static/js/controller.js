// CONTROLLERS
gcmsApp.controller('overviewController', ['$scope', 'cityService',function($scope,cityService) {
   console.log('hello');
   console.log($scope);  
   $scope.city = cityService.city;  
}]);

gcmsApp.controller('dunsSearchController', ['$scope', 'dunsService','$resource',function($scope,dunsService,$resource) {
   console.log( 'dunsEntered');
      console.log( $scope.duns);
$scope.dunsApi = $resource('/dunsSearch/:duns');
$scope.dunsResult = $scope.dunsApi.get({duns:$scope.duns});
	 console.log( $scope.dunsResult);

}]);

