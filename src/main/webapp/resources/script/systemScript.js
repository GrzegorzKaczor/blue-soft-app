$(document).ready(function () {
    $.getJSON('http://localhost:8080/system/all', function (data) {
        var table = $('#system-table').DataTable({
            info: false,
            pagingType: "simple_numbers"
        });

        console.log(data);
        data.forEach(function (dt) {
                const name = '<div class="ml-1">' + dt.name + '</div>';
                const descriptionSystem = '<div class="ml-1">' + dt.descriptionSystem + '</div>';
                const technologies = '<div class="ml-1">' + dt.technologies + '</div>';
                const owner = '<div class="ml-1">' + dt.owner + '</div>';

            row = [name, descriptionSystem, technologies, owner];
            table.row.add(row).draw();
            }
        );
    });
});




