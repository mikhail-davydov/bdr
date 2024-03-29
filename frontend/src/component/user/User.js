import {Component} from "react";
import {userIcon} from "../common/Constants";
import Icon from "../icon/Icon";

import "./User.css";

// todo: rename to UserInfo
class User extends Component {

    render() {
        let userIconClass = "user__icon";
        return (
            <div className="user-container" onClick={this.props.onClick}>
                <div className="user">
                    <Icon class={userIconClass} content={userIcon}/>
                </div>
            </div>
        )
    }

}

export default User;