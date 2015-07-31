(function(){
    'use strict';
    angular.module('rcw').controller('indexController',function($scope){
    	   var lengthCheck = function(targetModel ,targetLength){
               if(angular.isUndefined(targetModel)){
                   return 'text-muted';
               }else{
                   var warningLength = parseInt(targetLength * 0.9);
                   if(targetModel.length > targetLength){
                       return 'text-danger';
                   }else if(targetModel.length > warningLength){
                       return 'text-warning';
                   }else{
                       return 'text-muted';
                   }
               }
           };
           $scope.lengthCheck = lengthCheck;


    });
}());
