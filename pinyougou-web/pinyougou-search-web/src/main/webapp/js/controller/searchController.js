/** 定义搜索控制器 */
app.controller("searchController" ,function ($scope, baseService) {

    // 定义json对象封装搜索条件
    $scope.searchParam = {keywords : ''};

    // 商品搜索的方法
    $scope.search = function () {
        // 发送异步请求
        baseService.sendPost("/Search", $scope.searchParam).then(function(response){
            // 获取响应数据 response.data: {total: 100, rows:[{},{}]} rows:List<SolrItem>
            $scope.resultMap = response.data;
        });
    };
   
});
