<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css"/>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Page d'inscription</title>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="Accueil.jsp">NoulaleTransfert</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="Accueil.jsp">Accueil</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="contact.jsp">Contact <span class="caret"></span></a></li>
      <li><a href="About.html">Apropos de nous</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="inscription.jsp"><span class="glyphicon glyphicon-user"></span> S'inscrire</a></li>
      <li><a href="connexion.jsp"><span class="glyphicon glyphicon-log-in"></span> Connexion</a></li>
    </ul>
  </div>
</nav>
<form >
  <div class="container">
    <h1>Veuiller Remplir les informations suivantes !</h1>
    <p></p>
    <hr>
    <label for="email"><b>Prenom</b></label>
    <input   style="border: 1px solid black;"  style="border: 1px solid black;"  style="border: 1px solid black;"  style="border: 1px solid black;"  style="border: 1px solid black;"  style="border: 1px solid black;"  type="text" placeholder="Enter prenom" name="prenom" id="prenom" required>
    <label for="email"><b>Nom</b></label>
    <input  style="border: 1px solid black;"   type="text" placeholder="Enter nom" name="nom" id="nom" required>
    <label for="email"><b>date de naissance</b></label>
    <input   style="border: 1px solid black;"   type="text" placeholder="Enter date de naissance" name="date" id="date" required>
    <label for="email"><b>Email</b></label>
    <input  style="border: 1px solid black;"    type="text" placeholder="Enter Email" name="email" id="email" required>
   
    <label for="psw"><b>Password</b></label>
    <input  style="border: 1px solid black;"    type="password" placeholder="Enter Password" name="psw" id="psw" required>

    <label for="psw-repeat"><b>Repeat Password</b></label>
    <input  style="border: 1px solid black;"   type="password" placeholder="Repeat Password" name="psw-repeat" id="psw-repeat" required>
    <hr>

    <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
  <a href="connexion.jsp" style="margin-left: 20em;font-size: 20px;color: #fff;background-color: green;border:2px solid;border-color: red"> Registeraton</a>
  </div>

  <div class="container signin">
    <p>Already have an account? <a href="connexion.jsp">Sign in</a>.</p>
  </div>
</form>
<footer  class="bg-dark col-12 text-center text-white">
  <!-- Grid container -->
  <div class="container bg-danger col-12 p-4 pb-0">
    <!-- Section: Form -->
    <section class="">
      <form action="">
        <!--Grid row-->
        <div class="row d-flex justify-content-center">
          <!--Grid column-->
          <div class="col-auto">
            <p class="pt-2">
              <strong>Sign up for our newsletter</strong>
            </p>
          </div>
          <!--Grid column-->

          <!--Grid column-->
          <div class="col-md-5 col-12">
            <!-- Email input -->
            <div class="form-outline form-white mb-4">
              <input type="email" id="form5Example29" class="form-control" />
              <label class="form-label" for="form5Example29">Email address</label>
            </div>
          </div>
          <!--Grid column-->

          <!--Grid column-->
          <div class="col-auto">
            <!-- Submit button -->
            <button type="submit" class="btn btn-outline-light mb-4">
              Subscribe
            </button>
          </div>
          <!--Grid column-->
        </div>
        <!--Grid row-->
      </form>
    </section>
    <!-- Section: Form -->
  </div>
  <!-- Grid container -->

  <!-- Copyright -->
  <div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.2);">
    © 2023 Copyright:
    <a class="text-white" href="#">Thierno Mahmoudou Ba</a>
  </div>
  <!-- Copyright -->
</footer>
<script type="text/javascript">
//Sélectionner le formulaire et le bouton de soumission
const form = document.querySelector('form');
const submitBtn = document.querySelector('button[type="submit"]');

// Ajouter un gestionnaire d'événements pour le clic sur le bouton de soumission
submitBtn.addEventListener('click', (event) => {
  // Empêcher le formulaire d'être soumis avant la validation
  event.preventDefault();

  // Vérifier si tous les champs sont remplis
  const inputs = form.querySelectorAll('input');
  let allFilled = true;
  for (let i = 0; i < inputs.length; i++) {
    if (inputs[i].value === '') {
      allFilled = false;
      break;
    }
  }

  // Afficher le message de succès ou d'erreur approprié
  const message = document.querySelector('#message');
  if (allFilled) {
    message.textContent = 'Inscription réussie !';
    message.classList.remove('error');
    message.classList.add('success');
  } else {
    message.textContent = 'Veuillez remplir tous les champs.';
    message.classList.remove('success');
    message.classList.add('error');
  }
});
</script>
</body>
</html>