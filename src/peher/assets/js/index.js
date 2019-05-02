import React from 'react';
import ReactDOM from 'react-dom';
window.React = React;
window.ReactDOM = ReactDOM;

class YoutubePlayer extends React.Component {
  render() {
    return (
    <div data-video="dmGhakW9MXc"
         data-autoplay="0"
         data-loop="1"
         id="youtube-audio">
    </div>
    );
  }
}

ReactDOM.render(<YoutubePlayer/>, document.getElementById('yt-player'));
