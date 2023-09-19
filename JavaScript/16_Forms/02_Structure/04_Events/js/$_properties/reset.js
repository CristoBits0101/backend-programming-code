<!DOCTYPE html>

<html lang="en">

<head>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Reset() method /title>

</head>

<body style="text-align: center;">

    <div style="background: pink;">

        <font color="red" size="6px">

            <b> 
                Example of the reset() method 
            </b>

        </font>

    </div>

    <div style="background: lightblue;">

        <form id="myForm" action="#" style="font-size: 20px;">

            <p> First Name: <input type="text" id="fname"/></p>
            <p> Last  Name: <input type="text" id="lname"/></p>

            <p>
                <select id="color">
                    <option value="-1">Select....</option>
                    <option value="1" >Red       </option>
                    <option value="2" >Yellow    </option>
                    <option value="3" >Green     </option>
                    <option value="4" >Blue      </option>
                </select> 
            </p>

            <p> E-mail Id: <input type="email" id="email" /></p>
            <p> Age:       <input type="number" id="age"  /></p>

            <input type="submit">
            <input type="button" value="Reset data" onClick="fun()" />

        </form>

    </div>

    <script>

        function fun()
        {
            let Name = document.getElementById("fname");
            Name.value = "";

            let numero = document.getElementById("age");
            numero.value = "";

            document.getElementById("myForm").reset();
        }

    </script>

</body>

</html>