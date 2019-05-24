<?php
$con= new mysqli('localhost', 'root', '', 'project3');


$ins="SELECT * FROM `laptop`"; 
$result=mysqli_query($con,$ins);
$myArray = array();
$num=mysqli_num_rows($result);
if($num>0){
    while($row = $result->fetch_assoc()) {
    	         $myArray[] = $row;

    }
$json = json_encode(array($myArray));
echo substr($json,1,-1);
}else{
	echo "there is no row";
}


?>