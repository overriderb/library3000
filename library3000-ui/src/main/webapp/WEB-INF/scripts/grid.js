var app = angular.module('library3000App', ['ngGrid']);
app.controller('LibraryGrid', function($scope) {
    $scope.stabData = [
        {Title: "Java in a Box", Author: "Bruce Eckel", PageNumbers: "N/A", Description: "Interesting"},
        {Title: "JavaScript Pocket Reference", Author: "David Flanagan", PageNumbers: "N/A", Description: ""},
        {Title: "The Java Language Specification", Author: "Gilad Bracha, James Gosling, Guy Steele", PageNumbers: "N/A", Description: ""},
        {Title: "Thinking in Java", Author: "Bruce Eckel", PageNumbers: "N/A", Description: ""},
        {Title: "JUnit recipes", Author: "J. B. Rainsberger", PageNumbers: "N/A", Description: ""}
    ];
    $scope.gridOptions = {
        data: 'stabData',
        enableCellSelection: true,
        enableRowSelection: false,
        enableCellEdit: true,
        columnDefs: [
            { field: "Title", width: 250, enableCellEdit: true },
            { field: "Author", width: 250, enableCellEdit: true },
            { field: "PageNumbers", width: 100, enableCellEdit: true },
            { field: "Description", width: 300, enableCellEdit: true }
        ]
    };
});