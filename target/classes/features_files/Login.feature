@login
Feature: Authentification
  En tant que utilsateur je souhaite tester la page de connexion de l'application Swag Labs

  @connexion-casPassant
  Scenario: je souhaite tester la page de connexion avec un cas passant
    Given j accede a l application SwagLabs
    When je saisi le username "standard_user"
    And je saisi le mot de passe "secret_sauce"
    And je clique sur le bouton de conexion
    Then Je me redirige vers la page d'acceuil "Products"
 


