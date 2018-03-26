boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) 
{
    return ( ((yourLeft==friendsLeft)||(yourLeft==friendsRight))&&((yourRight==friendsLeft)||(yourRight==friendsRight)) );
}
