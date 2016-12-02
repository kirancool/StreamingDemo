/**
 * 
 */


(function () {
    'use strict';
var dapp = angular.module("dashbrods_app", ['datatables','ngMaterial']);
      
dapp.controller('dashboard_card_controller',function($scope,$http){
	
	$http.get("data/card.json")
	  .success( function(response) {    
	     //alert(JSON.stringify(response))
	     $scope.dashborddata=response;
    	});
});

dapp.controller('dashboard_usercard_controller',usercard);
function usercard($http,$scope){

	
	
	 function myFunc(){ 
			   $http.get("data/user_count_by_month.json")
			  .success( function(response) {    
			   $scope.dashborddata=response;
			   usercarddata(response);		     
		  	});
		} 
	 var myInterval = setInterval(myFunc, 4000);
	 
	 /*function changeInterval(){
	    clearInterval(myInterval);
	    myInterval = setInterval(myFunc, 4000);
	 }*/

	// changeInterval();
	 
	//var count = 0;
	//var time = 0;
	//setInterval(function () {
	//console.log(count);
	

	
	//$http.get("http://localhost:8080/twitter/data/getUserCountByMonth")
	/*$http.get("data/user_count_by_month.json")
	  .success( function(response) {    
	    // alert(response);
	     $scope.dashborddata=response;
	     usercarddata(response);
	     
  	});*/

	
	
	
	
	
function usercarddata(data){
		
	
var datajson={};
datajson.json=data;
var key={};
var color = {};
var shape = {};
var  value=[];
key.x='month';
value[0]='count';
key.value=value;
datajson.type="spline";
color["count"] = '#faebd7';
shape["count"] = 'square';
datajson.colors = color;
datajson.shape = shape;
datajson.lineThickness = '4', 
datajson.keys=key;		




var chart = c3.generate({
    bindto: '#usercard',
    size: {width:300, height:150},
    data: datajson,
    zoom: {
        enabled: true
    },
   
    tooltip: {
    	contents: function(d, defaultTitleFormat, defaultValueFormat, color) {
            var out, row, total, x, _i, _len;
            x = d[0].x;
            out = '<table class=""><tr><th class="tooltipheader" >' + defaultTitleFormat(x) + '</th></tr>';
            for (_i = 0, _len = d.length; _i < _len; _i++) { 
              row = d[_i]; 
              out += '<tr><td class="tooltiptext">' + defaultValueFormat(row.value) + '</td></tr>';
            }
            out += '</table>'; 
            return out;
    	}
    },
    legend: {
        show: false
    },
    point: {
        r: 4
    },
    axis: {
            x: {
               show:false,	
               type: 'category',
               tick: {
                  rotate: 10,
                  multiline: true
                },
            },
            y: {
            	show:false,
            	type: 'category',
                tick: {
                   rotate: 10,
                   multiline: false
                 }
            }  
        }
        
        
});



	chart.load({
        json: data,
        keys: {
            value: ['month', 'count'],
        }
    });

}
}



dapp.controller('dashboard_locationcard_controller',locationCard);
function locationCard($http,$scope){
	
	
	//$http.get("http://localhost:8080/twitter/data/getLocationCountByMonth")
	/*$http.get("data/location_count_by_month.json")
	  .success( function(response) {    
	     
	     $scope.dashBoardLocation=response;
	     dashLocation(response)
	     
  	});*/
	
	function myFunc(){ 
		$http.get("data/location_count_by_month.json")
		  .success( function(response) {    
		     
		     $scope.dashBoardLocation=response;
		     dashLocation(response)
		     
	  	});
	} 
   var myInterval = setInterval(myFunc, 4000);
	
	
function dashLocation(data){

var datajson={};
datajson.json=data;
var key={};
var color = {};
var  value=[];
key.x='month';
value[0]='count';
key.value=value;
datajson.type="bar";
color["count"] = '#faebd7';
datajson.colors = color;

datajson.keys=key;		
var chart = c3.generate({
    bindto: '#locationcard',
    size: {width:300, height:150},
    data: datajson,
    zoom: {
        enabled: true
    },
    legend: {
        show: false
    },
    tooltip: {
    	contents: function(d, defaultTitleFormat, defaultValueFormat, color) {
            var out, row, total, x, _i, _len;
            x = d[0].x;
            out = '<table class=""><tr><th class="tooltipheader" >' + defaultTitleFormat(x) + '</th></tr>';
            for (_i = 0, _len = d.length; _i < _len; _i++) { 
              row = d[_i]; 
              out += '<tr><td class="tooltiptext">' + defaultValueFormat(row.value) + '</td></tr>';
            }
            out += '</table>'; 
            return out;
    	}
    },
   
    axis: {
            x: {
               show:false,	
               type: 'category'
            },
            y: {
            	show:false,
            	type: 'category'
            }  
        },
});

chart.load({
    json: data,
    keys: {
        value: ['month', 'count'],
    }
});

}
}



dapp.controller('dashboard_twittercard_controller',twitterCard);
function twitterCard($http,$scope){
	
	
	//$http.get("http://localhost:8080/twitter/data/getTwitCountByMonth")
	/*$http.get("data/twitter_count_by_month.json")
	  .success( function(response) {    
	     
	     $scope.dashBoardTwitter=response;
	     dashTwitter(response)
	     
  	});*/
	
	function myFunc(){ 
		$http.get("data/twitter_count_by_month.json")
		  .success( function(response) {    
		     
		     $scope.dashBoardTwitter=response;
		     dashTwitter(response)
		     
	  	});
	} 
   var myInterval = setInterval(myFunc, 4000);
	
	
function dashTwitter(data){
		
	
var datajson={};
datajson.json=data;
var key={};
var color = {};
var shape = {};
var  value=[];
key.x='month'; 
value[0]='count';
key.value=value;
datajson.type="area-spline";
color["count"] = '#faebd7';
datajson.colors = color;
datajson.shape = shape;
datajson.keys=key;		

var chart = c3.generate({
    bindto: '#twittercard',
    size: {width:300, height:150},
    data: datajson,
    tooltip: {
    	contents: function(d, defaultTitleFormat, defaultValueFormat, color) {
            var out, row, total, x, _i, _len;
            x = d[0].x;
            out = '<table class=""><tr><th class="tooltipheader" >' + defaultTitleFormat(x) + '</th></tr>';
            for (_i = 0, _len = d.length; _i < _len; _i++) { 
              row = d[_i]; 
              out += '<tr><td class="tooltiptext">' + defaultValueFormat(row.value) + '</td></tr>';
            }
            out += '</table>'; 
            return out;
    	}
    },
    legend: {
        show: false
    },
    point: {
        show: false
    },
    zoom: {
        enabled: true
    },
    axis: {
            x: {
               show:false,	
               type: 'category',
               tick: {
                  rotate: 10,
                  multiline: true
                },
            },
            y: {
            	show:false,
            	type: 'category',
                tick: {
                   rotate: 10,
                   multiline: false
                 }
            }  
        }
        
        
});

chart.load({
    json: data,
    keys: {
        value: ['month', 'count'],
    }
});
}
}

dapp.controller('user_bar_controller',userBarChart);

function userBarChart($http,$scope){
	
	
	$http.get("http://localhost:8080/twitter/data/getCountOnUser")
	  .success( function(response) {    
	     $scope.userBarData=response;
	     userBar(response)
  	});
	
	
function userBar(data){
	
var datajson={};
datajson.json=data;
var key={};
var  value=[];
key.x='name';
value[0]='count';
key.value=value;
datajson.type="bar";
datajson.keys=key;	

//alert(JSON.stringify(datajson));
var chart = c3.generate({
    bindto: '#userbar',
    zoom: {
        enabled: true
    },
    data: datajson,
    axis: {
            x: {
               type: 'category',
               tick: {
                  rotate: 10,
                  multiline: false
                },

            }
        
        },


})
}
}

dapp.controller('user_donut_controller',userDonutChart);

function userDonutChart($http,$scope){

	
	$http.get("http://localhost:8080/twitter/data/getCountOnUser")
	  .success( function(response) {    
		 
	     $scope.userDonutData=response;
	     userDonut(response);
	   
	     
  	});
	
	
function userDonut(data){
	
var temp = [];	
var data1 = {};


for (var i = 0; i < data.length; i++)
{
	if(data[i]['name'] != null){
		temp.push(data[i]['name']);
		data1[data[i]['name']] = data[i]['count'];
	}
}

/*data.forEach(function(e) {
	
	
	alert(e.val);//alert(e._id);
	temp.push(e._id);
    data1[e._id] = e.count;
});*/   

//alert(JSON.stringify(data1));

var chart = c3.generate({
    bindto: '#userdonut',
    data: {
        json: [ data1 ],
        keys: {
            value: temp,
        },
        type:'donut',

        },
    axis: {
            x: {
               type: 'category',
               tick: {
                  rotate: 10,
                  multiline: false
                },

            }
        
        },


})
}
}


dapp.controller('location_area_controller',locationAreaChart);
function locationAreaChart($http,$scope){
	
	$http.get("http://localhost:8080/twitter/data/getCountOnCountry")
	  .success( function(response) {    
	     $scope.locationAreaData=response;
	     locationArea(response)
	     
  	});
	
	
function locationArea(data){
		
	
var datajson={};
datajson.json=data;
var key={};
var  value=[];
key.x='country';
value[0]='count';
key.value=value;
datajson.type="area";
datajson.keys=key;		
var chart = c3.generate({
    bindto: '#locationarea',
    zoom: {
        enabled: true
    },
    data: datajson,
    axis: {
            x: {
               type: 'category',
               tick: {
                  rotate: 10,
                  multiline: false
                },
            }      
        },
})
}
}


dapp.controller('location_line_controller',locationLineChart);
function locationLineChart($http,$scope){
	
	$http.get("http://localhost:8080/twitter/data/getCountOnCountry")
	  .success( function(response) {    
	     $scope.locationLineData=response;
	     locationLine(response)
	     
  	});
	
	
function locationLine(data){
		
	
var datajson={};
datajson.json=data;
var key={};
var  value=[];
key.x='country';
value[0]='count';
key.value=value;
datajson.type="line";
datajson.keys=key;		
var chart = c3.generate({
    bindto: '#locationline',
    data: datajson,
    zoom: {
        enabled: true
    },
    axis: {
            x: {
               type: 'category',
               tick: {
                  rotate: 10,
                  multiline: false
                },
            }      
        },
        grid: {
            x: {
                show: true
            },
            y: {
                show: true
            }
        }
})
}
}

dapp.controller('posts_pie_controller',postsPieChart);
function postsPieChart($http,$scope){
	
	$http.get("http://localhost:8080/twitter/data/getCountOnretweet")
	  .success( function(response) {    
	   
	     $scope.postsPieData=response;
	     pieData(response)
	   
	     
  	});
	
	function pieData(data){
		var temp = [];	
		var data1 = {};
		
		for (var i = 0; i < data.length; i++)
		{
			if(data[i]['user_Id'] != null){
				temp.push(data[i]['user_Id']);
				data1[data[i]['user_Id']] = data[i]['retweet'];
			}
		}

		/*data.forEach(function(e) {
			temp.push(e.id_str);
		    data1[e.id_str] = e.retweetCount;
		}); */
		
		
		var chart = c3.generate({
		    bindto: '#postspie',
		    zoom: {
		        enabled: true
		    },
		    data: {
		        json: [ data1 ],
		        keys: {
		            value: temp,
		        },
		        type:'pie',

		    },
		    axis: {
		            x: {
		               type: 'category',
		               tick: {
		                  rotate: 10,
		                  multiline: false
		                },
		            }      
		        },
		})
		
		}	

}




dapp.controller('posts_scatter_controller',twitterScatterChart);
function twitterScatterChart($http,$scope){
	
	$http.get("http://localhost:8080/twitter/data/getCountOnretweet")
	  .success( function(response) {    
	   
	     $scope.dashbordtwidata=response;
	     scatterData(response)
	   
	     
  	});
	
	function scatterData(data){
		var datajson={};
		datajson.json=data;
		var color = {};
		var key={};
		var  value=[];
		key.x='user_Id';
		value[0]='retweet';
		key.value=value;
		datajson.type="scatter";
		datajson.keys=key;
		color["count"] = 'red';
		datajson.colors = color;
		var chart = c3.generate({
		    bindto: '#twitterscatter',
		    zoom: {
		        enabled: true
		    },
		    data: datajson,
		    axis: {
		            x: {
		               type: 'category',
		               tick: {
		                  rotate: 10,
		                  multiline: false
		                },
		            }      
		        },
		})
		
		
		}	

}
/*function WithAjaxCtrl(DTOptionsBuilder, DTColumnBuilder) {
	var vm = this;
	vm.dtOptions = DTOptionsBuilder.fromSource("data/Ui/datatable_data.json")
	vm.dtOptions.paging=false;
	vm.dtOptions.scrollY="300px";
	vm.dtOptions.scrollCollapse =false;

    	//.withPaginationType('full_numbers');
	vm.dtColumns = [
    	DTColumnBuilder.newColumn('id').withTitle('ID'),
    	DTColumnBuilder.newColumn('firstName').withTitle('First name'),
    	DTColumnBuilder.newColumn('lastName').withTitle('Last name').notVisible()
	];
}*/

})();   