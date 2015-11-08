/**
 * Created by Ariel on 07/11/2015.
 */

app.controller('addCardController',function($scope,$modalInstance ){
    $scope.ok = function() {
        $modalInstance.close({
            'monitorName' : $scope.monitorName,
            'monitorType' : $scope.monitorType,
            'monitorProdact' : $scope.monitorProdact,
            'monitorSystem' : $scope.monitorSystem,
            'monitorExplain' : $scope.monitorExplain
        });
    };
    $scope.cancel = function() {
        $modalInstance.dismiss('cancel');
    };
});