sap.ui.controller("caraccident-web.caraccidentview", {

	/**
	 * Called when a controller is instantiated and its View controls (if available) are already created.
	 * Can be used to modify the View before it is displayed, to bind event handlers and do other one-time initialization.
	 * @memberOf caraccident-web.caraccidentview
	 */
	onInit: function() {
		that = this;
		var sOrigin = window.location.protocol + "//" + window.location.hostname
		+ (window.location.port ? ":" + window.location.port : "");
		var personsListOdataServiceUrl = sOrigin + "/caraccident-web/employeelist.svc";
		var odataModel = new sap.ui.model.odata.ODataModel(
				personsListOdataServiceUrl);
		odataModel.setCountSupported(false);
		this.getView().setModel(odataModel);
		//userID =  sap.ui.getCore().byId("userID");
		var personsPath = "/Employees('" + userID + "')";
		addNewPerson = function(sFirstName, sLastName,id) {
			var persons = {};
			persons.FirstName = sFirstName;
			persons.LastName = sLastName;
			persons.Id = id;
			that.getView().getModel().create("/Employees", persons, null, this.successMsg, this.errorMsg);
		};
		
		odataModel.read(personsPath,{ //Remove this when real data exists
            error : function(){
            	addNewPerson("limor","erez",userID);
        		addNewPerson("tahel","moyal","i069256");
             	
            }
        });
		odataModel.read(personsPath,{
            success : function(oData){
               sap.ui.getCore().byId("firstName").setValue(oData.FirstName)
               sap.ui.getCore().byId("lastName").setValue(oData.LastName)
            }});
	},
	addNewPerson : function(sFirstName, sLastName,id) {
		var persons = {};
		persons.FirstName = sFirstName;
		persons.LastName = sLastName;
		persons.Id = id;
		this.getView().getModel().create("/Employees", persons, null, this.successMsg, this.errorMsg);
	}
//	successMsg : function() {
//		sap.ui.commons.MessageBox.alert("Employees entity has been successfully created");
//	},
//	errorMsg : function() {
//		sap.ui.commons.MessageBox.alert("Error occured when creating person entity");
//	},

	/**
	 * Similar to onAfterRendering, but this hook is invoked before the controller's View is re-rendered
	 * (NOT before the first rendering! onInit() is used for that one!).
	 * @memberOf caraccident-web.caraccidentview
	 */
//	onBeforeRendering: function() {

//	},

	/**
	 * Called when the View has been rendered (so its HTML is part of the document). Post-rendering manipulations of the HTML could be done here.
	 * This hook is the same one that SAPUI5 controls get after being rendered.
	 * @memberOf caraccident-web.caraccidentview
	 */
//	onAfterRendering: function() {

//	},

	/**
	 * Called when the Controller is destroyed. Use this one to free resources and finalize activities.
	 * @memberOf caraccident-web.caraccidentview
	 */
//	onExit: function() {

//	}

});