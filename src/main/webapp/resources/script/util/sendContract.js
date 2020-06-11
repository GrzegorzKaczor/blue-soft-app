function addContract(method, idContract, idSystem) {
    $("#add-contract-button").click(function () {

        const systemName = $("#input-system-name").val();
        const systemDescription = $("#input-system-description").val();
        const systemTechnologies = $("#input-system-technologies").val();
        const systemOwner = $("#input-system-owner").val();

        const systemDto = {
            id: idSystem,
            name: systemName,
            descriptionSystem: systemDescription,
            technologies: systemTechnologies,
            owner: systemOwner
        };

        const orderNumber = $("#input-order-number").val();

        const yearFromDate = parseInt($("#input-year-from-date").val(), 10);
        const monthFromDate = parseInt($("#input-month-from-date").val(), 10);
        const dayFromDate = parseInt($("#input-day-from-date").val(), 10);
        const fromDate = {
            year: yearFromDate,
            month: monthFromDate,
            day: dayFromDate
        };

        const yearToDate = parseInt($("#input-year-to-date").val(), 10);
        const monthToDate = parseInt($("#input-month-to-date").val(), 10);
        const dayToDate = parseInt($("#input-day-to-date").val(), 10);
        const toDate = {
            year: yearToDate,
            month: monthToDate,
            day: dayToDate
        };

        const getValueGR = $("#input-amount-gr").val();

        var valueGr;

        if (getValueGR / 10 < 1) {
            valueGr = "0" + getValueGR;
        } else {
            valueGr = getValueGR
        }
        ;

        const amount = $("#input-amount-pln").val() + valueGr;

        var amountType;
        if ($("#input-amount-type").val() === "netto") {
            amountType = "NET";
        } else {
            amountType = "BRU";
        }
        ;

        var amountPeriod;
        if ($("#input-amount-period").val() === "rok") {
            amountPeriod = "YEAR";
        } else {
            amountPeriod = "MONTH";
        }
        ;

        var active;
        if ($("#inputActive" === "TAK")) {
            active = true;
        } else {
            active = false;
        }
        ;

        const contractDto = {
            id: idContract,
            systemDto: systemDto,
            orderNumber: orderNumber,
            fromDate: fromDate,
            toDate: toDate,
            amount: amount,
            amountType: amountType,
            amountPeriod: amountPeriod,
            active: active
        };

        $.ajax({
            method: method,
            url: "http://localhost:8080/contract",
            contentType: "application/json; charset=utf-8",
            data: JSON.stringify(contractDto),
            success: function () {
                window.location.href = "http://localhost:8080/page/all";
            },
            error: function () {
                alert("Nie udało się zapisać");
            }
        });
    });
}








