import React from "react";
import UserIcon from './user.svg';

import './User.css';

class User extends React.Component {
    render() {
        return (
            <div className="user">
                <img src={UserIcon} alt="User" className="user__img"/>
                <div className="user__fullname">Lorem ipsum.</div>
            </div>
        );
    }
}

export default User;