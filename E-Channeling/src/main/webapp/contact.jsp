<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contact Us - E-Channeling Sri Lanka</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
<jsp:include page="header.jsp"/>
    <main class="main-content">
        <section class="contact-section">
            <h2>Contact Us</h2>
            <p>If you have any questions or require assistance, feel free to get in touch with us. Our dedicated team is here to help you with any inquiries related to our services, appointments, or platform features.</p>

            <h3>Contact Information</h3>
            <ul>
                <li>Email: support@e-channeling.lk</li>
                <li>Phone: +94 112 345 678</li>
                <li>Address: 123, Health Avenue, Colombo 03, Sri Lanka</li>
            </ul>

            <h3>Send Us a Message</h3>
            <form action="#">
                <label for="name">Name:</label>
                <input type="text" id="name" name="name" required>

                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required>

                <label for="message">Message:</label>
                <textarea id="message" name="message" required></textarea>

                <button type="submit" class="btn-primary">Send Message</button>
            </form>

            <h3>Business Hours</h3>
            <p>Our customer support is available during the following hours:</p>
            <ul>
                <li>Monday - Friday: 9:00 AM - 6:00 PM</li>
                <li>Saturday: 9:00 AM - 1:00 PM</li>
                <li>Sunday: Closed</li>
            </ul>
        </section>
    </main>
</body>
</html>
