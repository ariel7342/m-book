/**
 * Created by Ariel on 22/11/2015.
 */
app.controller('uploadScriptsController',function($scope,$modalInstance ){

    $scope.fileNames = '';
    $scope.choose = function(){
        $('#uploadScripts').trigger('click');
    };
    $scope.add = function(valid){
        if(valid){
                $scope.data = 'none';
                var f = document.getElementById('uploadScripts').files[0];
                var r = new FileReader();
                r.onloadend = function(e){
                    console.log(e);
                    console.log(e.target);
                    $scope.data = e.target;
                    $scope.notPass = false;
                    $modalInstance.close({
                        'data':$scope.data,
                        'scriptName':$scope.scriptName,
                        'scriptExplain':$scope.scriptExplain
                    });
                };
            /*activate the onloadend to catch the file*/
                r.readAsBinaryString(f);
        } else {
            $scope.notPass = true;
        }
    };
    $scope.cancel = function() {
        $modalInstance.dismiss('cancel');
    };
});
