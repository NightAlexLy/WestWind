<div class="content-wrapper" style="margin-left:0px;border:0px;padding-top: 0px;">
    <!-- Content Header (Page header) -->
     <section class="content" style="margin-top: 10px;">
		<div class="row">
        <!-- left column -->
        <div class="col-md-6">
          <!-- general form elements -->
          <div class="box box-primary">
            <div class="box-header with-border">
              <h3 class="box-title">Compound Interest</h3>
              <div class="box-tools pull-right">
                <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                </button>
                <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button>
              	<a href="#">Report</a>
              </div>
            </div>
            <!-- /.box-header -->
            <!-- form start -->
            <form role="form" onsubmit="return false;">
              <div class="box-body">
                <div class="form-group" style="padding-top: 20px;">
	                <div class="col-lg-6">
	                  <label for="inputEmail3" class="col-sm-2 control-label" style="padding-top: 7px;">Money</label>
	                  <div class="col-sm-10">
	                    <input type="email" class="form-control" id="inputEmail3" placeholder="Money">
	                  </div>
	                </div>
	                <!-- /.col-lg-6 -->
	                <div class="col-lg-6">
		                  <label for="inputEmail3" class="col-sm-2 control-label" style="padding-top: 7px;">Rate</label>
		                  <div class="col-sm-10">
		                    <input type="email" class="form-control" id="inputEmail3" placeholder="Rate">
		                  </div>
	                  </div>
	                <!-- /.col-lg-6 -->
	              </div>
	              <div class="form-group" style="padding-top: 30px;">
	                <div class="col-lg-6">
	                  <label for="inputEmail3" class="col-sm-2 control-label" style="padding-top: 7px;">Unit</label>
	                  <div class="col-sm-10">
	                    <select class="form-control">
		                    <option>DAY</option>
		                    <option>MONTH</option>
		                    <option>YEAR</option>
		                  </select>
	                  </div>
	                </div>
	                <!-- /.col-lg-6 -->
	                <div class="col-lg-6">
		                  <label for="inputEmail3" class="col-sm-2 control-label" style="padding-top: 7px;">Num</label>
		                  <div class="col-sm-10">
		                    <input type="email" class="form-control" id="inputEmail3" placeholder="Num">
		                  </div>
	                  </div>
	                <!-- /.col-lg-6 -->
	              </div>
	              <div class="form-group" style="padding-top: 40px;">
	               <div class="col-xs-12 text-center">
	              		<button type="submit" class="btn btn-info" style="margin-right:80px;">Submit</button>
	              		<button type="submit" class="btn btn-warning"  style="margin-left:80px;">Reset</button>
	               </div>
	              </div>
	               <div class="form-group">
              	 	 <div class="box-body table-responsive">
    		              <table class="table table-hover">	
    		                <tbody><tr>
    		                  <th>Periods</th>
    		                  <th>Principal</th>
    		                  <th>Draw The Principal</th>
    		                </tr>
    		                <tr>
    		                  <td>183</td>
    		                  <td>John Doe</td>
    		                  <td>11-7-2014</td>
    		                </tr>
    		                <tr>
    		                  <td>219</td>
    		                  <td>Alexander Pierce</td>
    		                  <td>11-7-2014</td>
    		                </tr>
    		                <tr>
    		                  <td>657</td>
    		                  <td>Bob Doe</td>
    		                  <td>11-7-2014</td>
    		                </tr>
    		                <tr>
    		                  <td>175</td>
    		                  <td>Mike Doe</td>
    		                  <td>11-7-2014</td>
    		                </tr>
    		              </tbody></table>
	           	      </div>
          		  </div>
              </div>
              <!-- /.row -->
               </form>
            </div>
              <!-- /.box-body -->
        </div>
        <!--/.col (left) -->
        <!-- right column -->
        <div class="col-md-6">
          <!-- Horizontal Form -->
          <div class="box box-info">
            <div class="box-header with-border">
              <h3 class="box-title">Interest Rate</h3>
              <div class="box-tools pull-right">
                <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                </button>
                <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button>
              </div>
            </div>
            <!-- /.box-header -->
            <form role="form" onsubmit="return interestRate();" id="interestRateForm">
              <div class="box-body">
                <div class="form-group" style="padding-top: 20px;">
	                <div class="col-lg-6">
	                  <label for="inputEmail3" class="col-sm-3 control-label" style="padding-top: 7px;">Money</label>
	                  <div class="col-sm-8">
	                    <input type="text" class="form-control" name="money" placeholder="Money" />
	                  </div>
	                </div>
	                <!-- /.col-lg-6 -->
	                <div class="col-lg-6">
		                  <label for="inputEmail3" class="col-sm-3 control-label" style="padding-top: 7px;">Earnings</label>
		                  <div class="col-sm-8">
		                    <input type="text" class="form-control" name="earnings" placeholder="Earnings">
		                  </div>
	                  </div>
	                <!-- /.col-lg-6 -->
	              </div>
	              <div class="form-group" style="padding-top: 30px;">
	                <div class="col-lg-6">
	                  <label for="inputEmail3" class="col-sm-4 control-label" style="padding-top: 7px;">Day Rate</label>
	                  <div class="col-sm-10">
	                  	
	                  </div>
	                </div>
	                <!-- /.col-lg-6 -->
	                <div class="col-lg-6">
		                  <label for="inputEmail3" class="col-sm-4 control-label" style="padding-top: 7px;">Year Rate</label>
		                  <div class="col-sm-10">
		                  </div>
	                  </div>
	                <!-- /.col-lg-6 -->
	              </div>
	              <div class="form-group" style="padding-top: 40px;">
	               <div class="col-xs-12 text-center">
	              		<button type="submit" class="btn btn-info" style="margin-right:80px;">Submit</button>
	              		<button type="submit" class="btn btn-warning"  style="margin-left:80px;">Reset</button>
	               </div>
	              </div>
              </div>
               </form>
          </div>
          <!-- /.box -->
        </div>
        <!--/.col (right) -->
      </div>
     </section>
</div>
<script type="text/javascript">
  
  
  	
  	function interestRate(){
  	
  		//$("#interestRateForm").
  	
  		debugger;
  		
  		return false;
  		
  	}
  	
  
  
  
</script>
