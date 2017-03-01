'use strict';

/**
 * CarController
 * @constructor
 */
var KullaniciController = function($scope, $http) {
	
	$scope.kullanici = {};
    $scope.editMode = false;
    
	$scope.login = function(kullanici) {
        $scope.resetError();

        $http.post('kullanici/login', kullanici).success(function() {
        	window.location="#/cars";
        }).error(function() {
            $scope.setError('Kullanıcı Adı veya Şifre Bulunamadı');
        });
    };
    
    
    $scope.resetKullaniciForm = function() {
        $scope.resetError();
        $scope.train = {};
        $scope.editMode = false;
    };

    $scope.resetError = function() {
        $scope.error = false;
        $scope.errorMessage = '';
    };

    $scope.setError = function(message) {
        $scope.error = true;
        $scope.errorMessage = message;
    };
};