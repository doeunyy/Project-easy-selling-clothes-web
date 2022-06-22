<?php
    if(isset($_POST['submit']) or isset($_POST['submit_add'])){

        file_put_contents('data/'.$_POST['use'], $_POST['use']); 
        file_put_contents('data/'.$_POST['use'], $_POST['size']);
        file_put_contents('data/'.$_POST['use'], $_POST['tradeby']);
        file_put_contents('data/'.$_POST['use'], $_POST['price']);
    }

?>