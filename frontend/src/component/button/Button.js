import {Component} from "react";

import "./Button.css";

class Button extends Component {

    render() {
        return (
            <button className="button" type="button">
                {this.props.content}
            </button>
        )
    }

}

export default Button;