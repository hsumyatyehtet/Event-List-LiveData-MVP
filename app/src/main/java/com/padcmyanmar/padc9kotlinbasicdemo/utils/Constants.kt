package com.padcmyanmar.padc9kotlinbasicdemo.utils

const val BASE_URL="https://78743814-6e79-4273-8c16-c5afc7b81049.mock.pstmn.io/"
const val GET_EVENTS="/getAllEvents"
const val LOGIN="/login"
const val REGISTER="/register"

//Parameter
const val PARAM_ACCESS_TOKEN="access-token"

//Response Code
const val CODE_RESPONSE_OK=200

//Dummy Access Token
const val DUMMY_ACCESS_TOKEN="eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwOlwvXC8zNC43My45LjIyOFwvYXBpXC9sb2dpbi1ieS1wYXNzd29yZCIsImlhdCI6MTU2NjYxNzcxMSwiZXhwIjoxNTY5Mjk2MTExLCJuYmYiOjE1NjY2MTc3MTEsImp0aSI6InBabm9sMTljTEJ3c05zVFMiLCJzdWIiOjExLCJwcnYiOiJjZGU5NmRlZGNiMzMzODlmMjFhMWRhZjRlY2QyZDc0MWFkMGJlNWUyIn0.pGNd-8Ag_VIvCmrQ9xFzsr-NbLo-I-zvxeYjXXEkzCI"

//Error Message
const val EM_NULL_EVENT_RESPONSE="Check your Internet Connection"
const val EM_EVENT_MODEL_NOT_INITIALIZED="Event Model should have been initialized"

//DB Name
const val EVENT_DB="EventsDB"

class NetworkConstants{
    companion object{

    }
}