<section class="container">
       <form class="mt-4 mx-auto text-center" style="width: 50%">
        <div class="form-group">
            <label class="h5" for="InputOrderNumer">Numer umowy</label>
            <input type="text" class="form-control" id="InputOrderNumer">
        </div>
        <div class="form-group">
            <label class="h5" for="InputSystem">System</label>
            <input type="text" class="form-control" id="InputSystem">
        </div>
        <div class="form-row align-items-center">
            <div class="col-6">
                <label class="h5" for="InputFromDate">Umowa od</label>
                <input type="date" class="form-control" id="InputFromDate">
            </div>
            <div class="col-6">
                <label class="h5" for="InputToDate">Umowa do</label>
                <input type="date" class="form-control" id="InputToDate">
            </div>
        </div>
        <p class="mt-4 mb-1 h5">Kwota umowy</p>
        <div class="form-row align-items-center">
            <div class="col-6 mt-0">
                <label for="InputAmountPln">Złotych</label>
                <input type="number" class="form-control" id="InputAmountPln">
            </div>
            <div class="col-6">
                <label for="InputAmountGr">Groszy</label>
                <input type="number" class="form-control" id="InputAmountGr">
            </div>
        </div>
        <p class="mt-4 mb-1 h5">Rodzaj umowy</p>
        <div class="form-row align-items-center mt-3">
            <div class="col-4">
                <label for="InputAmountType">Typ</label>
                <select class="custom-select my-1 mr-sm-2" id="InputAmountType">
                    <option selected>...</option>
                    <option value="1">netto</option>
                    <option value="2">brutto</option>
                </select>
            </div>
            <div class="col-4">
                <label for="InputAmountPeriod">W skali</label>
                <select class="custom-select my-1 mr-sm-2" id="InputAmountPeriod">
                    <option selected>...</option>
                    <option value="1">miesiąc</option>
                    <option value="2">rok</option>
                </select>
            </div>
            <div class="col-4">
                <label for="InputActive">Aktywna</label>
                <select class="custom-select my-1 mr-sm-2" id="InputActive">
                    <option selected>...</option>
                    <option value="1">tak</option>
                    <option value="2">nie</option>
                </select>
            </div>
        </div>
        <button type="submit" class="btn btn-secondary mt-5 col-12">Submit</button>
        <div class="mt-5"></div>
    </form>
</section>