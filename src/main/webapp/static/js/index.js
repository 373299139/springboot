function login(){ 
　var sd = $('#loginId').serialize();

	 $.ajax({
         url: "/shiroController/register",    
         type: "post",    
         data:  sd,
         dataType: "json",    
         async:true,
         success: function (result) {    
        	 if(result.success){
        		 alert(result.msg);
        		 window.location.href ="/shiroController/jump";
        	 }else{
        		 alert(result.msg);
        	 }
         },
     });	
	
	
}