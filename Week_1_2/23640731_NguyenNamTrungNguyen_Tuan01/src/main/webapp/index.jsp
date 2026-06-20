<%@ page import="java.time.LocalDate" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <script src="https://cdn.tailwindcss.com"></script>
        <title>Exercise 04</title>
    </head>

    <body class="min-h-screen flex items-center justify-center bg-gray-100">
        <div class="bg-white w-[700px] p-6 rounded shadow">
            <form action="${pageContext.request.contextPath}/processFormUpload"
                  method="post" enctype="multipart/form-data"
                  class="space-y-4 rounded-lg">

                <h1 class="text-center font-bold text-2xl">HTML Form Example with File Upload</h1>

                <!-- NAME -->
                <div>
                    <label class="block font-medium">Name:</label>
                    <input type="text" name="name"
                           class="w-full border p-2 rounded" />
                </div>

                <!-- PASSWORD -->
                <div>
                    <label class="block font-medium">Password:</label>
                    <input type="password" name="password"
                           class="w-full border p-2 rounded" />
                </div>

                <!-- GENDER -->
                <div class="flex gap-4 mt-1">
                    <label class="font-medium mb-1">Gender:</label>

                    <label class="flex items-center gap-1">
                        <input type="radio" name="gender" value="male" checked />
                        Male
                    </label>

                    <label class="flex items-center gap-1">
                        <input type="radio" name="gender" value="female" />
                        Female
                    </label>
                </div>

                <!-- HOBBIES -->

                <div class="flex flex-row gap-2 mt-1 space-x-4">
                    <label class="block font-medium">Hobbies:</label>
                    <label><input type="checkbox" name="hobbies" value="reading"> Reading</label>
                    <label><input type="checkbox" name="hobbies" value="sports"> Sports</label>
                    <label><input type="checkbox" name="hobbies" value="music"> Music</label>
                </div>

                <%--Country--%>

                <div class="flex space-x-3 w-full">
                    <label class="font-medium mt-2">Country:</label>
                    <select name="country" class="w-[200px] border p-2 rounded">
                        <option value="vietnam">Vietnam</option>
                        <option value="japan">Japan</option>
                        <option value="laos">Laos</option>
                        <option value="china">China</option>
                        <option value="southkorea">South Korea</option>
                    </select>
                </div>

                <%--Birth Date--%>
                <%
                    String today = LocalDate.now().toString();
                %>

                <div class="flex space-x-3 w-full">
                    <label class="font-medium mt-2">Birth Date:</label>
                    <input type="date" value="<%= today %>" name="birthDate" class="w-[200px] border p-2 rounded"/>
                </div>

                <%-- About --%>
                <div class="flex space-x-3 w-full">
                    <label class="font-medium">About:</label>
                    <textarea name="about" rows="4" cols="30" class="w-full border p-2 rounded"></textarea><br/><br/>
                </div>

                <%-- Profile Picture:--%>
                <div class="flex space-x-3 w-full items-center">
                    <label class="font-medium">Profile Picture:</label>
                    <label class="cursor-pointer bg-gray-200 px-5 py-2 rounded border">
                        Choose file
                        <input type="file" name="profilePic" class="">
                    </label>
                </div>

                <!-- BUTTON -->
                <button type="submit"
                        class="w-full bg-blue-500 text-white p-2 rounded hover:bg-blue-600">
                    Submit
                </button>
            </form>
        </div>
    </body>
</html>