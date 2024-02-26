document.addEventListener('DOMContentLoaded', function () {
    const mobileMenuButton = document.getElementById('mobile-menu');
    const nav = document.querySelector('nav');

    mobileMenuButton.addEventListener('click', function () {
        nav.classList.toggle('show');
    });

    const contactForm = document.getElementById('contact-form');

    contactForm.addEventListener('submit', function (event) {
        event.preventDefault();
        // Aquí puedes agregar lógica para enviar el formulario
        alert('Formulario enviado con éxito');
        contactForm.reset();
    });
});
