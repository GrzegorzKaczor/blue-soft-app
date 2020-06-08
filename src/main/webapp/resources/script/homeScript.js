$(document).ready(function () {
    var table = $('#contract-tab').DataTable({
        info: false,
        pagingType: "simple_numbers"
    });
    $.getJSON('http://localhost:8080/contract/all', function (data) {
        data.forEach(function (dt) {
                const orderNumber = dt.orderNumber;
                const system = dt.system;

                const fromDate = dt.fromDate.year + "-" + dt.fromDate.month + "- " + dt.fromDate.day;
                const toDate = dt.toDate.year + "-" + dt.toDate.month + "-" + dt.toDate.day;

                var valueMapAmountType;
                if (dt.amountType === "NET") {
                    valueMapAmountType = "netto";
                } else {
                    valueMapAmountType = "brutto";
                }
                ;
                const amount = dt.amount / 100 + " " + valueMapAmountType;

                var valueMapActivePeriod;

                if (dt.amountPeriod === "MONTH") {
                    valueMapActivePeriod = "na miesiąc";
                } else {
                    valueMapActivePeriod = "na rok";
                }
                ;
                const amountPeriod = valueMapActivePeriod;

                var activeMapValue;
                if (dt.active === true) {
                    activeMapValue = "TAK";
                } else {
                    activeMapValue = "NIE";
                }
                ;
                const active = activeMapValue;

                data = [orderNumber, system, fromDate, toDate, amount, amountPeriod, active];
                table.row.add(data).draw();
            }
        );
    });
    table.rows.add(dataTab).draw();
});

