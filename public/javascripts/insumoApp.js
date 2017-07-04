angular.module('insumoApp',['ui.router','ngResource','insumoApp.controllers','insumoApp.services']);

angular.module('insumoApp').config(function($stateProvider,$httpProvider){
    $stateProvider.state('insumos',{
        url:'/insumos',
        templateUrl:'assets/partials/insumo/insumos.html',
        controller:'InsumoListController'
    }).state('viewInsumo',{
       url:'/insumos/:id/view',
       templateUrl:'assets/partials/insumo/insumo-view.html',
       controller:'InsumoViewController'
    }).state('newInsumo',{
        url:'/insumos/new',
        templateUrl:'assets/partials/insumo/insumo-add.html',
        controller:'InsumoCreateController'
    }).state('editInsumo',{
        url:'/insumos/:id/edit',
        templateUrl:'assets/partials/insumo/insumo-edit.html',
        controller:'InsumoEditController'
    });
}).run(function($state){
   $state.go('insumos');
});