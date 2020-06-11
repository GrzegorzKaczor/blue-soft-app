function showContractTable(endpoint) {
    $(document).ready(function () {
        $('#add-contract').hide();
        var table = createTable();
        addRowsToTable(table, endpoint);
    });
}

function createTable() {
    var table = $('#contract-tab').DataTable({
        info: false,
        pagingType: "simple_numbers"
    });
    return table;
}

function addRowsToTable(table, endpoint) {
    $.getJSON('http://localhost:8080/contract/' + endpoint, function (data) {

        data.forEach(function (dt) {
                const orderNumber = orderNumberValue(dt);
                const systemName = systemNameValue(dt);
                const fromDate = fromDateValue(dt);
                const toDate = toDateValue(dt);
                const amount = prepareAmountValue(dt);
                const amountPeriod = amountPeriodValue(dt);
                const active = activeValue(dt);
                const buttons = getButtons(dt);
                dataRow = [orderNumber, systemName, fromDate, toDate, amount, amountPeriod, active, buttons];
                table.row.add(dataRow).draw();
            }
        );
    });
}


function prepareAmountValue(dt) {
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
    return amount;
}

function orderNumberValue(dt) {
    const orderNumber = '<div class="ml-1">' + dt.orderNumber + '</div>';
    return orderNumber;
}

function systemNameValue(dt) {
    const system = '<div class="text-center">' + dt.systemDto.name + '</div>';
    return system;
}

function fromDateValue(dt) {
    const fromDate =
        '<div class="ml-1">' +
        dt.fromDate.year + "-" + dt.fromDate.month + "- " + dt.fromDate.day +
        '</div>';
    return fromDate;
}

function toDateValue(dt) {
    const toDate =
        '<div class="ml-1">' +
        dt.toDate.year + "-" + dt.toDate.month + "-" + dt.toDate.day +
        '</div>';
    return toDate;
}

function amountPeriodValue(dt) {
    var valueMapAmountPeriod;
    if (dt.amountPeriod === "MONTH") {
        valueMapAmountPeriod = "na miesiąc";
    } else {
        valueMapAmountPeriod = "na rok";
    }
    ;
    const amountPeriod = '<div class="ml-1">' + valueMapAmountPeriod + '</div>';
    return amountPeriod;
}

function activeValue(dt) {
    var activeMapValue;
    if (dt.active === true) {
        activeMapValue = "TAK";
    } else {
        activeMapValue = "NIE";
    }
    ;
    const active = '<div class="text-center">' + activeMapValue + '</div>';
    return active;
}

function getButtons(dt) {
    const buttons =
        '<div class=text-center>' +
        '<button type="button" class="btn btn-warning btn-sm mr-2" onclick="editContract(' +
        dt.id + ',' + dt.systemDto.id +
        ')">Edycja</button>' +
        '<button type="button" class="btn btn-danger btn-sm" onclick="deleteContract(' +
        dt.id +
        ')">Usuń</button>' +
        '</div>';
    return buttons;
}

function deleteContract(id) {
    $.ajax({
        method: "delete",
        url: "http://localhost:8080/contract/" + id,
        success: function () {
            alert("Usunięto umowę");
            window.location.replace("http://localhost:8080/page/all")
        },
        error: function () {
            alert("Nie udało się usunąć");
        }
    });
};

function setAmountType(data) {
    var valueMapAmountType;
    if (data.amountType === "NET") {
        valueMapAmountType = "netto";
        $('#option-netto').hide();
    } else {
        valueMapAmountType = "brutto";
        $('#option-brutto').hide();
    }
    ;
    $('#select-amount-type').text(valueMapAmountType);
}

function setAmountPeriod(data) {
    var valueMapAmountPeriod;

    if (data.amountPeriod === "MONTH") {
        valueMapAmountPeriod = "na miesiąc";
        $('#option-month').hide();
    } else {
        valueMapAmountPeriod = "na rok";
        $('#option-year').hide();
    }
    ;
    $('#select-amount-period').text(valueMapAmountPeriod);
}

function setActive(data) {
    var activeMapValue;
    if (data.active === true) {
        activeMapValue = "TAK";
        $('#option-true').hide();
    } else {
        activeMapValue = "NIE";
        $('#option-false').hide();
    }
    ;
    $('#select-active').text(activeMapValue);
}

function setDataToUpdateContract(id) {
    $.getJSON('http://localhost:8080/contract/' + id, function (data) {
        console.log(data);
        $('#input-system-name').val(data.systemDto.name);
        $('#input-system-description').val(data.systemDto.descriptionSystem);
        $('#input-system-technologies').val(data.systemDto.technologies);
        $('#input-system-owner').val(data.systemDto.owner);
        $('#input-order-number').val(data.orderNumber);
        $('#input-year-from-date').val(data.fromDate.year);
        $('#input-month-from-date').val(data.fromDate.month);
        $('#input-day-from-date').val(data.fromDate.day);
        $('#input-year-to-date').val(data.toDate.year);
        $('#input-month-to-date').val(data.toDate.month);
        $('#input-amount-pln').val((data.amount - data.amount % 100) / 100);
        $('#input-amount-gr').val(data.amount % 100);
        $('#input-day-to-date').val(data.toDate.day);

        setAmountType(data);
        setAmountPeriod(data);
        setActive(data);
    });
}

function editContract(idContract, idSystem) {
    $('#add-contract').show();
    setDataToUpdateContract(idContract);
    addContract("put", idContract, idSystem);
};

