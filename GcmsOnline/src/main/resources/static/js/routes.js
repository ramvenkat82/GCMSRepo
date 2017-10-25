// ROUTES
gcmsApp.config(function ($routeProvider) {
   
    $routeProvider
    
    .when('/', {
        templateUrl: 'overview.html',
        controller: 'overviewController'
    })

     .when('/dunsSearch', {
        templateUrl: 'dunsResult.html',
        controller: 'dunsSearchController'
    })

    .when('/settings', {
        templateUrl: 'settings.html'
       
    })

    .when('/profile', {
        templateUrl: 'profile.html'
    })

    .when('/help', {
        templateUrl: 'help.html'
    })
    
});