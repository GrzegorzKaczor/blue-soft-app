$(document).ready(function () {
    var table = $('#contract-tab').DataTable({
        info: false,
        pagingType: "simple_numbers"
    });
    $.getJSON('http://localhost:8080/contract/all', function (data) {
        data.forEach(function (dt) {
                const orderNumber = '<div class="ml-1">' + dt.orderNumber + '</div>';
                const system = '<div class="text-center">' + dt.systemDto.name + '</div>';

                const fromDate =
                    '<div class="ml-1">' +
                    dt.fromDate.year + "-" + dt.fromDate.month + "- " + dt.fromDate.day +
                    '</div>';
                const toDate =
                    '<div class="ml-1">' +
                    dt.toDate.year + "-" + dt.toDate.month + "-" + dt.toDate.day +
                    '</div>';

                var valueMapAmountType;
                if (dt.amountType === "NET") {
                    valueMapAmountType = "netto";
                } else {
                    valueMapAmountType = "brutto";
                }
                ;
                const amount =
                    '<div class="ml-1">' +
                    dt.amount / 100 + " " + valueMapAmountType +
                    '</div>';

                var valueMapActivePeriod;

                if (dt.amountPeriod === "MONTH") {
                    valueMapActivePeriod = "na miesiąc";
                } else {
                    valueMapActivePeriod = "na rok";
                }
                ;
                const amountPeriod = '<div class="ml-1">' + valueMapActivePeriod + '</div>';

                var activeMapValue;
                if (dt.active === true) {
                    activeMapValue = "TAK";
                } else {
                    activeMapValue = "NIE";
                }
                ;
                const active = '<div class="text-center">' + activeMapValue + '</div>';

                const buttons =
                    '<div class=text-center>' +
                    '<button type="button" class="btn btn-warning btn-sm mr-2" onclick="editContract(' +
                    dt.id +
                    ')">Edycja</i></button>' +
                    '<button type="button" class="btn btn-danger btn-sm" onclick="deleteContract(' +
                    dt.id +
                    ')">Usuń</i></button>' +
                    '</div>';

                data = [orderNumber, system, fromDate, toDate, amount, amountPeriod, active, buttons];
                table.row.add(data).draw();
            }
        );
    });
});

function editContract(id) {
    alert('Edit ' + id);
}

function deleteContract(id) {
    $.ajax({
        method: "delete",
        url: "http://localhost:8080/contract/" + id,
        success: function () {
            alert("Usunięto umowę");
            window.location.replace("http://localhost:8080")
        },
        error: function () {
            alert("Nie udało się usunąć");
        }
    });
}
