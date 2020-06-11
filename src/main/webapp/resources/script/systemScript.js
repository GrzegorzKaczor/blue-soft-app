//Prepared table layout to show systems
function createTable() {
    var table = $('#system-table').DataTable({
        info: false,
        pagingType: "simple_numbers"
    });
    return table;
}

//Prepared data nad add to table
function addRowToTable(data, table) {
    data.forEach(function (dt) {
            const name = '<div class="ml-1">' + dt.name + '</div>';
            const descriptionSystem = '<div class="ml-1">' + dt.descriptionSystem + '</div>';
            const technologies = '<div class="ml-1">' + dt.technologies + '</div>';
            const owner = '<div class="ml-1">' + dt.owner + '</div>';

            row = [name, descriptionSystem, technologies, owner];
            table.row.add(row).draw();
        }
    );
}

//Get systems data from server and show in table
$(document).ready(function () {
    $.getJSON('http://localhost:8080/system/all', function (data) {
        var table = createTable();
        addRowToTable(data, table);
    });
});




