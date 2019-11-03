var seleccionados=0;
var tribuna=0,suri=0,nortei=0,orientali=0,occidentali=0;
var l = document.createElement("ul")
/*
var sur = document.createElement("li");
var norte = document.createElement("li");
var oriental = document.createElement("li");
var occidental = document.createElement("li");
sur.id="sur";
norte.id="norte";
oriental.id="oriental";
occidental.id="occidental";
sur.appendChild(document.createTextNode("Sur " +suri));
norte.appendChild(document.createTextNode("Norte "+nortei));
oriental.appendChild(document.createTextNode("Oriental "+orientali));
occidental.appendChild(document.createTextNode("Occidental "+occidentali));

l.appendChild(sur);
l.appendChild(norte);
l.appendChild(oriental);
l.appendChild(occidental);

document.getElementById("TotalSillas").appendChild(l);
*/
$(function(){

$('#btnSeating').on('click', createseating);


});
//Note:In js the outer loop runs first then the inner loop runs completely so it goes o.l. then i.l. i.l .i.l .i.l. i.l etc and repeat

function create(x){
	console.log(x +" "+ tribuna);
	if(x!==tribuna){
		createseating();
		tribuna=x;
	}
}

function createseating(){

 var seatingValue = [];
 for ( var i = 0; i < 10; i++){
   
    for (var j=0; j<10; j++){
        var seatingStyle = "<div id='"+i.toString()+"-"+j.toString()+"' class='seat available'></div>";
        seatingValue.push(seatingStyle);
  }   
}

$('#messagePanel').html(seatingValue);

       $(function(){
            $('.seat').on('click',function(){ 
            	

              if($(this).hasClass( "selected" )){
            	  
                $( this ).removeClass( "selected" );                  
              }else{                   
                $( this ).addClass( "selected" );
              }

            });

            $('.seat').mouseenter(function(){     
                $( this ).addClass( "hovering" );

                   $('.seat').mouseleave(function(){ 
                   $( this ).removeClass( "hovering" );
                      
                   });
            });


       });

};









