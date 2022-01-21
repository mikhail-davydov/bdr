import React from "react";

import "./Button.css";

class Button extends React.Component {

    render() {
        return (
            <button type="button" className={this.props.buttonClass} onClick={this.props.handleClick}>
                {this.props.buttonValue}
            </button>
        );
    }

}

export default Button;