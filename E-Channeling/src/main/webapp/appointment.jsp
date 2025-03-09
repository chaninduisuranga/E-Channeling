<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Book Appointment</title>
    <link rel="stylesheet" href="./CSS/appointment.css">
</head>
<body>
    <div class="container">
        <h2>Book an Appointment</h2>
        <form action="BookAppointmentServlet" method="POST">
            <label for="user_id">Your User ID:</label>
            <input type="text" id="user_id" name="user_id" required>

            <label for="doctor">Select Doctor:</label>
            <select id="doctor" name="doc_id" required>
                <option value="10001">Dr. Heshani (Ragama Hospital)</option>
                <option value="10002">Dr. Moditha (Gampaha Hospital)</option>
            </select>

            <label for="a_date">Select Date & Time:</label>
            <input type="datetime-local" id="a_date" name="a_date" required>

            <button type="submit">Book Appointment</button>
        </form>
    </div>
</body>
</html>
