/**
 * Created by Ariel on 06/11/2015.
 */
app.controller('monitorController',function($scope,$modalInstance ,newCard){
    $scope.newCard = newCard;
    $scope.ok = function() {
        $modalInstance.close({
        });
    };
    $scope.cancel = function() {
        $modalInstance.dismiss('cancel');
    };
});